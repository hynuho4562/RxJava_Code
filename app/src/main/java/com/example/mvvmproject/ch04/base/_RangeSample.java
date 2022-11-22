package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _RangeSample {
    public static void main(String[] args) {
        Flowable<Integer> flowable = Flowable
                .range(10, 3)
                .filter(data -> data % 2 == 0);

        flowable.subscribe(new _DebugSubscriber<>());
    }
}