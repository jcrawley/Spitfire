package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

public class SubscriptExpression extends VariableExpression {

    private Expression collection;
    private Expression index;

    public SubscriptExpression(VariableExpression base, Expression index) {
        this.collection = base;
        this.index = index;
    }

    public Expression getBase() {
        return collection;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    boolean isWritableLValue() {
        return collection.type instanceof ArrayType && collection.isWritableLValue();
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        collection.analyze(log, table, owner, inLoop);
        index.analyze(log, table, owner, inLoop);

        collection.assertArrayOrString("[]", log);
        index.assertInteger("[]", log);
        type = (collection.type == Type.STRING) ? Type.CHARACTER
            : collection.type instanceof ArrayType ? ArrayType.class.cast(collection.type).getBaseType()
            : Type.ARBITRARY;
    }
}
