package com.company;

public final class Bowl {
    private int food;

    public void theBowlIsEmptied(int countFood) {
        food = 100;
        if(food != 20) {
        food -= countFood;
        }else{
            System.out.println("В миске мало еды");
        }
        System.out.println("Bowl: " + food);
    }

}
