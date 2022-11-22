package com.example.mvvmproject.ch04.base;

import io.reactivex.rxjava3.core.Flowable;

public class _ErrorSample {
    public static void main(String[] args) {
        Flowable
                .error(new Exception("예외 발생"))
                .subscribe(new _DebugSubscriber<>());
    }
}
