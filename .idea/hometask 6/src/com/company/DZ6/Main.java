package com.company.DZ6;

public class Main {


    public static void main(String[] args) {

        Cat barsik = new Cat();
        barsik.setName("Барсик");
        barsik.setRun(-1);
        barsik.setToSwim(10);

        Cat murzik = new Cat();
        murzik.setName("Мурзик");
        murzik.setRun(150);
        murzik.setToSwim(10);

        Cat pushok = new Cat();
        pushok.setName("Пушок");
        pushok.setRun(250);
        pushok.setToSwim(10);

        Dog maks = new Dog();
        maks.setName("Макс");
        maks.setRun(250);
        maks.setToSwim(10);
    }
}
