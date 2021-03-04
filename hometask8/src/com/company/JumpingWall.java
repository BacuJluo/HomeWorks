package com.company;

public class JumpingWall implements Jumping {
    private int jumpWall;

    public JumpingWall(int jumpWall){
        this.jumpWall = jumpWall;
    }

    @Override
    public int jump () {
        return jumpWall;
    }

    public int getJumpWall() {
        return jumpWall;
    }
}
