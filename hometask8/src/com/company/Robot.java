package com.company;

public class Robot{
    private final int JUMP_HEIGHT = 150;
    private final int RUN_LENGTH = 1500;
    private String name;


    public Robot(String name) {
        this.name = name;
    }

    public void isJump(JumpingWall jumpingWall) {
        if (jumpingWall.jump() <= 0) {
            System.out.println("Высота не может быть отрицательной или равняться нулю");
        } else if (jumpingWall.jump() == JUMP_HEIGHT) {
            System.out.println(getName() + " с трудом перепрыгнул\nВысота стены равна: " + jumpingWall.getJumpWall() + "см");
        } else if (jumpingWall.jump() < JUMP_HEIGHT) {
            System.out.println(getName() + " с легкостью перепрыгнул\nВысота стены равна: " + jumpingWall.getJumpWall() + "см");
        } else {
            System.out.println(getName() + " не смог перепрыгнуть\nВысота стены равна: " + jumpingWall.getJumpWall() + "см, что является больше чем высота прыжка робота");
        }
    }

    public void isRun(RunningTrack runningTrack) {
        if (runningTrack.run() <= 0) {
            System.out.println("Длина не может быть отрицательной или равняться нулю");
        } else if (runningTrack.run() == RUN_LENGTH) {
            System.out.println(getName() + " с трудом пробежал\nРасстояние равно: "+runningTrack.getRunTrack()+"м");
        } else if (runningTrack.run() < RUN_LENGTH) {
            System.out.println(getName() + " с легкостью пробежал\nРасстояние равно: "+runningTrack.getRunTrack()+"м");
        } else {
            System.out.println(getName()+" не смог пробежать\nРасстояние равно: "+runningTrack.getRunTrack()+"м, что является больше чем высота прыжка человека");
        }
    }

    public String getName() {
        return name;
    }

}
