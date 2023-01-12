package com.hoany.chaptor01.item03.functionalinterface;
@FunctionalInterface
public interface MyFunction {

    String valudOf(Integer integer);

    static String hello() {
        return "hello";
    }
}
