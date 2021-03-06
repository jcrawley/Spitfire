package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

/**
 * A singleton class for an object representing the literal <code>nothing</code>.
 */
public class NullLiteral extends Literal {

    public static NullLiteral INSTANCE = new NullLiteral();

    private NullLiteral() {
        super("<>");
    }

    /**
     * Analyzes this literal.
     */
    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        type = Type.NULL_TYPE;
    }
}
