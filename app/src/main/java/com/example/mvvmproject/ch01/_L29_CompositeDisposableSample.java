package com.example.mvvmproject.ch01;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class _L29_CompositeDisposableSample {
    public static void main(String[] args) throws InterruptedException {

        CompositeDisposable compositeDisposable = new CompositeDisposable();

        compositeDisposable.add(Flowable.range(1,3)
                .doOnCancel(() -> System.out.println("No.1 canceled"))
                .observeOn(Schedulers.computation())
                .subscribe(data -> {
                    Thread.sleep(100L);
                    System.out.println("No.1: " + data);
                }));

        compositeDisposable.add(Flowable.range(1, 3)
                .doOnCancel(() -> System.out.println("No.2 canceled"))
                .observeOn(Schedulers.computation())
                .subscribe(data -> {
                    Thread.sleep(100L);
                    System.out.println("No.2: " + data);
                }));

        Thread.sleep(150L);

        compositeDisposable.dispose();
    }
}
