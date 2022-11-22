package com.example.mvvmproject.ch03;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class _L22_MissingBackpressureFlowableSample {
    public static void main(String[] args) throws InterruptedException {
        Flowable<Long> flowable = Flowable.interval(10L, TimeUnit.MILLISECONDS)
                .doOnNext(value -> System.out.println("emit: " + value));

        flowable
                .observeOn(Schedulers.computation())
                .subscribe(new Subscriber<Long>() {
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        subscription.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Long value) {
                        try {
                            System.out.println("waiting.......");
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("received: " + value);
                    }

                    @Override
                    public void onError(Throwable error) {
                        System.out.println("에러=" + error);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("종료");
                    }
                });

        Thread.sleep(5000L);
    }
}
