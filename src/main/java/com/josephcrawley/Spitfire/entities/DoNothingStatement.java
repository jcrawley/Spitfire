package com.josephcrawley.Spitfire.entities;

import com.josephcrawley.util.Log;

public class DoNothingStatement extends Statement {

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        // Intentionally empty
    }
}
