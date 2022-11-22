package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _EmptySample {
    public static void main(String[] args) {
        Flowable
                .empty()
                .subscribe(new _DebugSubscriber<>());
    }
}
