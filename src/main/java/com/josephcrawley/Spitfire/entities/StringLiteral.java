package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

/**
 * A string literal.
 */
public class StringLiteral extends Literal {

    public StringLiteral(String lexeme) {
        super(lexeme);
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        this.type = Type.STRING;
    }
}
