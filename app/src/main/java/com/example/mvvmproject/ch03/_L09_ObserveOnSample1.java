package com.example.mvvmproject.ch03;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subscribers.ResourceSubscriber;

public class _L09_ObserveOnSample1 {
    public static void main(String[] args) throws Exception {
        Flowable<Long> flowable =
                Flowable
                        .just(0, 1, 2, 3, 4, 5)
                        .interval(300L, TimeUnit.MILLISECONDS)
                        .onBackpressureDrop();

        flowable
                .observeOn(Schedulers.computation(), false, 2)
                .subscribe(new ResourceSubscriber<Long>() {
                    @Override
                    public void onNext(Long item) {
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception exception) {
                            exception.printStackTrace();
                            System.exit(1);
                        }

                        String threadName = Thread.currentThread().getName();
                        System.out.println(threadName + ":" + item);
                    }

                    @Override
                    public void onError(Throwable error) {
                        error.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("성공");
                    }
                });

        Thread.sleep(7000L);
    }
}