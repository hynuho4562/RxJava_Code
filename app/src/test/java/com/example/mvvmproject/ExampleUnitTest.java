package com.example.mvvmproject;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import com.example.mvvmproject.ch02.ReferenceTypeObject;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        final ReferenceTypeObject instance = new ReferenceTypeObject();

        assertThat(instance.getValue(), is("A"));

        instance.setValue("8");

        assertThat(instance.getValue(), is("B"));
    }
}