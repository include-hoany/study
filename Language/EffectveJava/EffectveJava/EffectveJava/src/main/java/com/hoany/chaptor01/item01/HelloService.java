package com.hoany.chaptor01.item01;

public interface HelloService {
    public String hello();

    static String hi() {
        return "hi";
    }

    default String bye() {
        return "bye";
    }

}
