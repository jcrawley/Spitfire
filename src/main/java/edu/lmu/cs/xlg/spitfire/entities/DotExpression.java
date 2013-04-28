package edu.lmu.cs.xlg.manatee.entities;

import edu.lmu.cs.xlg.util.Log;

public class DotExpression extends VariableExpression {

    private VariableExpression object;
    private String fieldName;

    public DotExpression(VariableExpression object, String fieldName) {
        this.object = object;
        this.fieldName = fieldName;
    }

    public VariableExpression getObject() {
        return object;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    boolean isWritableLValue() {
        return true;
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        // TODO
    }
}
