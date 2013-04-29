package edu.lmu.cs.xlg.manatee.entities;

import java.util.List;

import edu.lmu.cs.xlg.util.Log;

/**
 * A subroutine called from an expression.  It therefore has a return type.
 */
public class Function extends Subroutine {

    private Type returnType;

    public Function(Type returnType, String name, List<Variable> parameters, Block body) {
        super(name, parameters, body);
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public void analyzeSignature(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        // TODO: Analyze type
        super.analyzeSignature(log, table, owner, inLoop);
    }
}
