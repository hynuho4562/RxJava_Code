package com.example.mvvmproject.ch01;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class _L32_CompletableSample {
    public static void main(String[] args) throws InterruptedException {

        Completable completable = Completable.create(new CompletableOnSubscribe() {
            @Override
            public void subscribe(@NonNull CompletableEmitter emitter) throws Throwable {
                emitter.onComplete();
            }
        });

        completable
                .subscribeOn(Schedulers.computation())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("완료");
                    }

                    @Override
                    public void onError(@NonNull Throwable error) {
                        error.printStackTrace();
                    }
                });

        // 잠시 기다린다.
        Thread.sleep(1000L);
    }
}