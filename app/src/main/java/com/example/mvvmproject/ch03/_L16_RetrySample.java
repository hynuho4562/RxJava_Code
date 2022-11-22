package com.example.mvvmproject.ch03;

import org.reactivestreams.Subscription;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;

public class _L16_RetrySample {
    public static void main(String[] args) {
        Flowable<Integer> flowable = Flowable.<Integer> create(emitter -> {
            System.out.println("Flowable 처리 시작");

            for (int i = 1; i <= 3; i++) {
                if (i == 2) {
                    throw new Exception("예외 발생");
                }

                emitter.onNext(i);
            }

            emitter.onComplete();
            System.out.println("Flowable 처리 완료");

        }, BackpressureStrategy.BUFFER)
                .doOnSubscribe(
                        subscription -> System.out.println("flowable: doOnSubscribe"))
                .retry(2);

        flowable.subscribe(new FlowableSubscriber<Integer>() {
            @Override
            public void onSubscribe(@NonNull Subscription subscription) {
                System.out.println("subscriber: onSubscribe");
                subscription.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(Integer data) {
                System.out.println("data=" + data);
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
    }
}
