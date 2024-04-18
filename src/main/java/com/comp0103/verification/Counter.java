package com.comp0103.verification;

public class Counter {
    private int count;

    public Counter() {
    }

    public Counter increment() {
        ++count;
        return this;
    }

    public Counter decrement() {
        --count;
        return this;
    }

    public int count() {
        return count;
    }
}
