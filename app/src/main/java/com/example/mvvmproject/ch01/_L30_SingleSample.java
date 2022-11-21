package com.example.mvvmproject.ch01;

import java.time.DayOfWeek;
import java.time.LocalDate;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

public class _L30_SingleSample {
    public static void main(String[] args) {
        Single<DayOfWeek> single = Single.create(emitter -> {
            emitter.onSuccess(LocalDate.now().getDayOfWeek());
        });

        single.subscribe(new SingleObserver<DayOfWeek>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {

            }

            @Override
            public void onSuccess(@NonNull DayOfWeek dayOfWeek) {
                System.out.println(dayOfWeek);
            }

            @Override
            public void onError(@NonNull Throwable error) {
                error.printStackTrace();
            }
        });
    }
}
