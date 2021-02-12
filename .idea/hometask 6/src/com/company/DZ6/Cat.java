package com.company.DZ6;

class Cat extends Animal{
    public int run;

    public void setRun(int run) {
        int runDistance = 200;
        if (run > 0 && run <= runDistance) {
            this.run = run;
            System.out.println(getName()+" пробежал: "+getRun()+" (метров)");
        } else if(run <= 0){
            System.out.println(getName()+"(у) необходимо пробежать хоть небольшое расстояние");
        } else {
            System.out.println(getName()+" устал, и не может дальше бежать");
        }
    }
    public int getRun() { return run; }

    @Override
    public void setToSwim(int toSwim) {
        System.out.println(getName()+" не умеет плавать\n");
    }
}
