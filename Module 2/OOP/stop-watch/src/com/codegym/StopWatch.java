package com.codegym;

import java.time.*;

public class StopWatch {
    LocalTime startTime;
    LocalTime endTime;

    public StopWatch() {
    }

    private LocalTime getStartTime() {
        return startTime = LocalTime.now();
    }

    private LocalTime getEndTime() {
        return endTime = LocalTime.now();
    }

    public void start() {
        getStartTime();
        System.out.println(getStartTime());
    }

    public void stop() {
        getEndTime();
        System.out.println(getEndTime());
    }

    public long getElapsedTime() {
        int a=startTime.getNano();
        int b=endTime.getNano();
        return (b-a)/1000000;
    }
}
