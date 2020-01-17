package com.beppe.utils;

public class Static {

    public static TimedResult timeFunction(Runnable toRun) {
        TimedResult timer = new TimedResult();
        timer.start();
        toRun.run();
        timer.end();
        return timer;

    }
}
