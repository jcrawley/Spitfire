package com.josephcrawley.Spitfire.entities;

import java.util.List;

import com.josephcrawley.util.Log;

/**
 * An expression directly constructing an array, such as
 * <ul>
 * <li>new int[]{35, 22, 19}
 * <li>new char[]{'3', '%'}
 * <li>new string[]{}
 * </ul>
 */
public class ArrayLiteral{


	private String typename;
    private List<Expression> args;

    public ArrayLiteral(List<Expression> args) { //NEED TO IMPLEMENT TYPE
        this.args = args;
    }

    public String getTypename() {
        return typename;
    }

    public List<Expression> getArgs() {
        return args;
    }

	public void analyze(Log log, SymbolTable table, Subroutine owner,
			boolean inLoop) {
		// TODO Auto-generated method stub
		
	}
    
}