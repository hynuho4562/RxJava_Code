package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _JustSample {
    public static void main(String[] args) {
        Flowable<String> flowable = Flowable.just("A", "B", "C", "D", "E");

        flowable.subscribe(new _DebugSubscriber<>());
    }
}
