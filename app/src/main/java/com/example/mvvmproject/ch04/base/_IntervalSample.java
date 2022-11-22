package com.example.mvvmproject.ch04.base;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Flowable;

public class _IntervalSample {
    public static void main(String[] args) throws InterruptedException {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss.SSS");

        Flowable<Long> flowable = Flowable.interval(1000L, TimeUnit.MILLISECONDS);

        System.out.println("시작 시각: " + LocalTime.now().format(formatter));

        flowable.subscribe(data -> {
            String threadName = Thread.currentThread().getName();
            String time = LocalTime.now().format(formatter);

            System.out.println(threadName +": " + time + ": data=" + data);
        });

        Thread.sleep(5000L);
    }
}
