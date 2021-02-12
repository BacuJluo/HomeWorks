package com.company.DZ6;

public class Dog extends Animal{
    public int run;
    public int toSwim;

    public void setRun(int run) {
        int runDistance = 500;
        if (run > 0 && run <= runDistance) {
            this.run = run;
            System.out.println(getName()+" пробежал: "+getRun()+" (метров)");
        } else if(run <= 0){
            System.out.println("Вашему псу необходимо пробежать хоть небольшое расстояние");
        } else {
            System.out.println(getName()+" устал, и не может дальше бежать");
        }
    }
    public int getRun() { return run; }

    @Override
    public void setToSwim(int toSwim) {
        int swimDistance = 10;
        if(toSwim > 0 && toSwim <= swimDistance){
            this.toSwim = toSwim;
            System.out.println(getName()+" проплыл: "+getToSwim()+" (метров)");
        } else if(toSwim <= 0){
            System.out.println("Вашему псу необходимо проплыть хоть небольшое растояние");
        }else {
            System.out.println(getName()+" устал, и не может больше плыть");
        }
    }
    public int getToSwim(){return toSwim;}
}
