package com.example.mvvmproject.ch03;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _L01_IteratorSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        Subscriber<Integer> subscriber = new Subscriber<Integer>() {

            private List<Integer> list = new ArrayList<>();

            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(Integer data) {
                if (list.size() <= 5) {
                    list.add(data);
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
}
