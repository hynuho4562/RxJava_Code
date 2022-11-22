package com.example.mvvmproject.ch04.base;

import java.time.LocalTime;

import io.reactivex.rxjava3.core.Flowable;

public class _DeferSample {
    public static void main(String[] args) throws Exception {
        Flowable<LocalTime> flowable =
                Flowable.defer(() -> Flowable.just(LocalTime.now()));

        flowable.subscribe(new _DebugSubscriber<>("No. 1"));

        Thread.sleep(2000L);

        flowable.subscribe(new _DebugSubscriber<>("No. 2"));
    }
}