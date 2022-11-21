package com.example.mvvmproject.ch02;

import java.math.BigDecimal;
import java.util.function.BiFunction;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.IntFunction;

public class anonymous_class {

    // 익명 클래스로 구현
    BiFunction<Integer, Integer, BigDecimal> biFunction =
            new BiFunction<Integer, Integer, BigDecimal>() {
                @Override
                public BigDecimal apply(Integer value1, Integer value2) {
                    return new BigDecimal(value1 + value2);
                }
            };

    // 람다식으로 구성
    BiFunction<Integer, Integer, BigDecimal> function = (Integer value1, Integer value2) -> new BigDecimal(value1 + value2);

    // 함수형 인터페이스: Function -> 인자를 전달받아 반환값을 반환하는 인터페이스
    Function3<Integer, Integer, Integer, Integer> function3 = new Function3<Integer, Integer, Integer, Integer>() {
        @Override
        public Integer apply(Integer integer, Integer integer2, Integer integer3) throws Throwable {
            return integer + integer2 + integer3;
        }
    };

    IntFunction<Integer> integerIntFunction = new IntFunction<Integer>() {
        @Override
        public Integer apply(int num) throws Throwable {
            return num;
        }
    };

    Action action = new Action() {
        @Override
        public void run() throws Throwable {

        }
    };

    Consumer<String> consumer = new Consumer<String>() {
        @Override
        public void accept(String s) throws Throwable {

        }
    };

    Cancellable cancellable = new Cancellable() {

        // 어떤 취소 처리를 구현하는 데 사용하는 인터페이스이다.
        @Override
        public void cancel() throws Throwable {

        }
    };
}
