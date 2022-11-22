package com.example.mvvmproject.ch03;

import android.view.ScaleGestureDetector;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class _L13_CounterSample {
    public static void main(String[] args) throws Exception {
        final Counter counter = new Counter();

        // Counter 의 increment 메서드를 10,000번 호출한다.
        Flowable.range(1, 10000)
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.computation())
                .subscribe(data ->
                        counter.increment(),
                        error -> System.out.println("에러=" + error),
                        () -> System.out.println("counter.get()=" + counter.get()));

        Flowable.range(1, 10000)
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.computation())
                .subscribe(
                        data -> counter.increment(),
                        error -> System.out.println("에러=" + error),
                        () -> System.out.println("counter.get()=" + counter.get()));

        Thread.sleep(1000L
        );
    }
}
