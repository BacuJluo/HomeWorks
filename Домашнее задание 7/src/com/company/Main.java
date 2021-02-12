package com.company;

public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat(15);
        barsik.setName("Барсик");
        Bowl bowl = new Bowl();
        //bowl.info();
        barsik.eat(bowl);
        //bowl.info();


    }
}
