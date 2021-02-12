package com.company;

public class Cat {
    private String name;
    private int appetite;
    private int fullness;

    public Cat (int appetite) {
        this.appetite = appetite;
        fullness = 100;
    }

    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() { return name; }

    public void eat(Bowl p) {
        p.theBowlIsEmptied(appetite);
        System.out.println(getName()+" съел "+appetite+" ед. еды");
    }

}
