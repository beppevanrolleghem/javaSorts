package com.beppe.utils;

public class TimedResult {

    public long startTime;
    public long endTime;

    public long getTime() throws Exception {
        if (startTime == 0) throw new Exception("Timer has not started");
        if (endTime == 0) throw new Exception("Timer has not ended");

        return endTime - startTime;

    }

    public long getMilliseconds() throws Exception {
        return getTime() / 1000;
    }

    public long getSeconds() throws Exception {
        return getMilliseconds() / 1000;
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void end() {
        endTime = System.nanoTime();
    }

    public void Reset() {
        startTime = 0;
        endTime = 0;
    }


    @Override
    public String toString() {
        try {
            return String.format("Took %d nanoseconds, %d milliseconds, %d seconds to run", getTime(), getMilliseconds(), getSeconds());
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
