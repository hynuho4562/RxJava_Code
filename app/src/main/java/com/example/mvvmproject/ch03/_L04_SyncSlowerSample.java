package com.example.mvvmproject.ch03;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Flowable;

public class _L04_SyncSlowerSample {
    public static void main(String[] args) throws InterruptedException {
        Flowable.interval(1000L, TimeUnit.MILLISECONDS)
                // 데이터를 통지할 때의 시스템 시각을 출력한다.
                .doOnNext(data -> System.out
                        .println("emit: " + System.currentTimeMillis() + "밀리초: " + data))
                // 구독한다.
                .subscribe(data -> Thread.sleep(2000L));

        // 잠시 기다린다.
        Thread.sleep(5000L);
    }
}
