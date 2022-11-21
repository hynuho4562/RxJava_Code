package com.example.mvvmproject.ch01;

import java.time.DayOfWeek;
import java.time.LocalDate;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;

public class _L31_MaybeSample {
    public static void main(String[] args) {
        Maybe<DayOfWeek> maybe = Maybe.create(emitter -> {
            emitter.onSuccess(LocalDate.now().getDayOfWeek());
        });

        maybe.subscribe(new MaybeObserver<DayOfWeek>() {
            @Override
            public void onSubscribe(@NonNull Disposable disposable) {

            }

            @Override
            public void onSuccess(@NonNull DayOfWeek value) {
                System.out.println(value);
            }

            @Override
            public void onError(@NonNull Throwable error) {
                error.printStackTrace();
            }

            @Override
            public void onComplete() {
            }
        });
    }
}
