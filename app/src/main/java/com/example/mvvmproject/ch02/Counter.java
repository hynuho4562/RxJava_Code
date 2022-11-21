package com.example.mvvmproject.ch02;

public class Counter {
    private volatile int count;

    void increment() {
        count += 1;
    }

    int get() {
        return count;
    }
}
