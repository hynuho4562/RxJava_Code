package com.example.mvvmproject.ch01;

import org.reactivestreams.Subscription;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subscribers.ResourceSubscriber;

public class  _L25_RequestMethodSample {
    public static void main(String[] args) {
        Flowable.just(1, 2, 3)
                .subscribe(new FlowableSubscriber<Integer>() {
                    @Override
                    public void onSubscribe(@NonNull Subscription subscription) {
                        System.out.println("onSubscribe START");
                        subscription.request(Long.MAX_VALUE);
                        System.out.println("onSubscribe END");
                    }

                    @Override
                    public void onNext(Integer data) {
                        System.out.println(data);
                    }

                    @Override
                    public void onError(Throwable error) {
                        error.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("완료");
                    }
                });

        Flowable flowable = null;

        if (flowable != null) {
            Disposable disposable = (Disposable) flowable.subscribeWith(new ResourceSubscriber() {
                @Override
                public void onNext(Object o) {

                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onComplete() {

                }
            });
        }
    }
}
