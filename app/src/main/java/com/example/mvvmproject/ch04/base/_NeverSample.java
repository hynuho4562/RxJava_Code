package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _NeverSample {
    public static void main(String[] args) {
        Flowable
                .never()
                .subscribe(new _DebugSubscriber<>());
    }
}
