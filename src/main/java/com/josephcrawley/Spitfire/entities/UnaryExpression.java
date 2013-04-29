package com.josephcrawley.Spitfire.entities;

import edu.lmu.cs.xlg.util.Log;

/**
 * An expression made up of an operator and a single operand.
 */
public class UnaryExpression extends Expression {

    private String op;
    private Expression operand;

    /**
     * Creates a unary expression.
     */
    public UnaryExpression(String op, Expression operand) {
        this.op = op;
        this.operand = operand;
    }

    /**
     * Returns the operator.
     */
    public String getOp() {
        return op;
    }

    /**
     * Returns the operand.
     */
    public Expression getOperand() {
        return operand;
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        operand.analyze(log, table, owner, inLoop);

        if ("!".equals(op)) {
            operand.assertBoolean(op, log);
            type = Type.BOOLEAN;

        } else if ("-".equals(op)) {
            operand.assertArithmetic(op, log);
            type = operand.getType();

        } else {
            throw new RuntimeException("Internal error in unary expression analysis");
        }
    }
}
