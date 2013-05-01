package com.josephcrawley.Spitfire.entities;
import com.josephcrawley.util.*;

public class PrintStatement extends Statement {

    private Expression operand;

    public PrintStatement(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }


    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        operand.analyze(log, table, owner, inLoop);
    }
}
