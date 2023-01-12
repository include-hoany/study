package com.hoany.chaptor01.item03.staticfactory;

import lombok.Singular;

import java.util.function.Supplier;

public class Concert {

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sign();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }
}
