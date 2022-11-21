package com.example.mvvmproject.ch03;

import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

public class _L03_FlowableSample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        Flowable<String> flowable = Flowable.fromIterable(list);

        flowable.subscribe(System.out::println);
    }
}