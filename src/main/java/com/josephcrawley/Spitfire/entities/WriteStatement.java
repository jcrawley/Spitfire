package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

/**
 * A statement for writing a single expression to standard output.
 */
public class WriteStatement extends Statement {

    private Expression expression;

    public WriteStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    //@Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        expression.analyze(log, table, owner, inLoop);
    }
}
