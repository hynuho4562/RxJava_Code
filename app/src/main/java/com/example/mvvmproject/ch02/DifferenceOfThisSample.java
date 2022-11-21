package com.example.mvvmproject.ch02;

import androidx.annotation.NonNull;

import io.reactivex.rxjava3.functions.Action;

public class DifferenceOfThisSample {
    public static void main(String[] args) throws Throwable {
        DifferenceOfThisSample target = new DifferenceOfThisSample();
        target.execute();
    }

    private void execute() throws Throwable {
        Action anonymous = new Action() {
            @Override
            public void run() throws Throwable {
                System.out.println("익명 클래스의 this: " + this);
            }
        };

        Action lambda = () -> System.out.println("람다식의 this: " + this);

        anonymous.run();
        lambda.run();
    }

    @NonNull
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
