package com.example.mvvmproject.ch03;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;

public class _L17_OnErrorResumeItemSample {
    public static void main(String[] args) {
        Flowable.just(1, 3, 5, 0, 2, 4)
                .map(data -> 100 / data)
                /*
                .onErrorReturn(new Function<Throwable, Integer>() {
                    @Override
                    public Integer apply(Throwable throwable) throws Throwable {
                        return 123123;
                    }
                })
                */
                .onErrorReturnItem(0)
                .subscribe(new DisposableSubscriber<Integer>() {
                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("integer=" + integer);
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
    }
}
