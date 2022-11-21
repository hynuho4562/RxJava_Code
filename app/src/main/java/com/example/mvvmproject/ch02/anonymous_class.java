package com.example.mvvmproject.ch02;

import java.math.BigDecimal;
import java.util.function.BiFunction;

import io.reactivex.rxjava3.functions.Predicate;

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

    
}
