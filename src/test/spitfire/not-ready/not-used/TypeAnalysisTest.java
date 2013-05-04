package com.josephcrawley.Spitfire;

import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.josephcrawley.Spitfire.entities.ArrayConstructor;
import com.josephcrawley.Spitfire.entities.BooleanLiteral;
import com.josephcrawley.Spitfire.entities.CharacterLiteral;
import com.josephcrawley.Spitfire.entities.Expression;
import com.josephcrawley.Spitfire.entities.NullLiteral;
import com.josephcrawley.Spitfire.entities.NumberLiteral;
import com.josephcrawley.Spitfire.entities.StringLiteral;
import com.josephcrawley.Spitfire.entities.Type;
import com.josephcrawley.util.Log;

/**
 * Unit tests for analyzing types and testing type compatibility.
 */
public class TypeAnalysisTest {

    private Log log = new Log("Spitfire", new PrintWriter(System.out, true));

    Expression nullLiteral = NullLiteral.INSTANCE;
    Expression no = BooleanLiteral.FALSE;
    Expression yes = BooleanLiteral.TRUE;
    Expression half = new NumberLiteral("0.5");
    Expression dollar = new CharacterLiteral("'$'");
    Expression dog = new StringLiteral("\"dog\"");
    Expression rat = new StringLiteral("\"rat\"");
    Expression emptyArray = new ArrayConstructor(new ArrayList<Expression>());
    Expression arrayOfOneNull = new ArrayConstructor(Arrays.asList(nullLiteral));
    Expression arrayOfTwoNulls = new ArrayConstructor(Arrays.asList(nullLiteral, nullLiteral));

    private void check(Expression e, Type t) {
        e.analyze(log, null, null, false);
        assertEquals(e.getType(), t);
    }

    private void checkArray(List<Expression> list, Type t) {
        check(new ArrayConstructor(list), t);
    }

    @Test
    public void testSimpleExpressions() {
        check(new CharacterLiteral("'Z'"), Type.CHARACTER);
        check(new StringLiteral("\"Zyxwvut\""), Type.STRING);
    }

    @Test
    public void testEmptyArrayExpression() {
        check(emptyArray, Type.ARBITRARY_ARRAY);
    }

    @Test
    public void testSingletonArrayExpressions() {
        checkArray(Arrays.asList(nullLiteral), Type.NULL_TYPE.array());
        checkArray(Arrays.asList(half), Type.NUMBER.array());
        checkArray(Arrays.asList(dollar), Type.CHARACTER.array());
        checkArray(Arrays.asList(dog), Type.STRING.array());
        checkArray(Arrays.asList(emptyArray), Type.ARBITRARY_ARRAY.array());
        check(arrayOfOneNull, Type.NULL_TYPE.array());
        checkArray(Arrays.asList(arrayOfOneNull), Type.NULL_TYPE.array().array());
    }

    @Test
    public void testHomogeneousArrayExpressions() {
        checkArray(Arrays.asList(nullLiteral, nullLiteral), Type.NULL_TYPE.array());
        checkArray(Arrays.asList(half, half), Type.NUMBER.array());
        checkArray(Arrays.asList(dollar, dollar), Type.CHARACTER.array());
        checkArray(Arrays.asList(dog, dog, rat), Type.STRING.array());
        checkArray(Arrays.asList(emptyArray, emptyArray), Type.ARBITRARY_ARRAY.array());
    }


}
