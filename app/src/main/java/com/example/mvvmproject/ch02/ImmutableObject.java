package com.example.mvvmproject.ch02;

import java.sql.Date;
import java.util.concurrent.atomic.*;

public final class ImmutableObject {
    private final Date value;

    public ImmutableObject(Date date) {
        // 가변적인 Date가 변경돼도 영향이 없도록 복제한 값을 설정한다.
        this.value = (Date)date.clone();
    }

    public Date getValue() {
        // 반환값 Date가 외부에서 변경돼도 영향이 없도록 복제한 값을 반환한다.
        return (Date)value.clone();
    }

    public ImmutableObject changeValue(Date value) {
        return new ImmutableObject(value);
    }
}
