package edu.lmu.cs.xlg.manatee.entities;


public class NamedType extends Type {

    private String name;

    public NamedType(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }
}
