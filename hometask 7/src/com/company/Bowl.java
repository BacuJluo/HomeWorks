package com.company;

public final class Bowl {
    private int foodValue;

    public Bowl(int foodValue) {this.foodValue = foodValue;}

    public boolean theBowlIsEmptied(int countEatFood) {
        if (hasEnoughFood(countEatFood)) {
            foodValue -= countEatFood;
            return true;
        }
        return false;
    }

    private boolean hasEnoughFood(int requiredCountFood){
        return foodValue >= requiredCountFood;
    }

    public void addFood (int countFood){
        foodValue += countFood;
    }
    public void info (){
        System.out.println("Bowl: " + foodValue);
    }

}

