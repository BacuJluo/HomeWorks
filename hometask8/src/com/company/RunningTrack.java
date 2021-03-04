package com.company;

public class RunningTrack implements Runnable {
    private int runTrack;

    public RunningTrack(int runTrack){
        this.runTrack=runTrack;
    }

    @Override
    public int run(){
        return runTrack;
    }

    public int getRunTrack() {
        return runTrack;
    }
}
