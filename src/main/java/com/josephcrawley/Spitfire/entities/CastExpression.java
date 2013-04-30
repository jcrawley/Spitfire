package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

public class CastExpression extends Expression {

    private Expression expression;
    private Type type;

    public CastExpression(Expression expression, Type type) {
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        // TODO: Make sure you really CAN cast to the type!
    }
}
