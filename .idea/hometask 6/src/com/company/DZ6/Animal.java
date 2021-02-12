package com.company.DZ6;

public abstract class Animal {

    public abstract void setToSwim(int toSwim);

    public String name;

    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() { return name; }


}
