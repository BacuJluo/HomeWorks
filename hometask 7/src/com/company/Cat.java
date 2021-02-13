package com.company;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        satiety = bowl.theBowlIsEmptied(appetite);
        System.out.println(getName()+" съел " + appetite);
    }

    @Override
    public String toString() {
        return "Cat{"+
                "name='"+name+'\''+
                ", appetite="+appetite+
                ", satiety="+satiety+
                '}';
    }

    public String getName() {
        return name;
    }
}