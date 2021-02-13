package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15);
        Bowl bowl = new Bowl(100);
        cat.eat(bowl);
        bowl.theBowlIsEmptied(15);
        bowl.info();
        bowl.addFood(20);
        bowl.info();

    }
}
