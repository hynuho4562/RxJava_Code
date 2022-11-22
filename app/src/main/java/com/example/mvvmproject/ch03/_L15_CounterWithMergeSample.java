package com.example.mvvmproject.ch03;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class _L15_CounterWithMergeSample {
    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        Flowable<Integer> score1 = Flowable.range(1, 10000)
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.computation());

        Flowable<Integer> score2 = Flowable.range(1, 10000)
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.computation());

        Flowable.merge(score1, score2)
                .subscribe(
                        data -> counter.increment(),
                        error -> System.out.println("에러=" + error),
                        () -> System.out.println("counter.get()=" + counter.get()));

        Thread.sleep(2000L);
    }
}
