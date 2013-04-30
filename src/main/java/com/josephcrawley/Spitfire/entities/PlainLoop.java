package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

/**
 * An unqualified loop statement.
 */
public class PlainLoop extends Statement {

    private Block body;

    public PlainLoop(Block body) {
        this.body = body;
    }

    public Block getBody() {
        return body;
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        body.analyze(log, table, owner, true);
    }
}
