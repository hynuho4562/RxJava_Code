package com.example.mvvmproject.basic_structure;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public abstract interface Processor<T, R> extends Subscriber<T>, Publisher<R> {

}
