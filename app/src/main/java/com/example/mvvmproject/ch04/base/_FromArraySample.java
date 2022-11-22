package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _FromArraySample {
    public static void main(String[] args) {
        Flowable<String> flowable = Flowable.fromArray("A", "B", "C", "D", "E");

        flowable.subscribe(new _DebugSubscriber<>());
    }
}
