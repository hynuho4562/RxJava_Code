package com.example.mvvmproject.ch04.base;

import java.util.concurrent.Callable;

import io.reactivex.rxjava3.core.Flowable;

public class _FromCallableSample {
    public static void main(String[] args) {
        Flowable<Long> flowable = Flowable.fromCallable(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return System.currentTimeMillis();
            }
        });

        flowable.subscribe(new _DebugSubscriber<>());
    }
}
