package com.hoany.chaptor01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    /* 정적팩토리 메소드를 통해
    //  인터페이스를 다형성을 통해 객체를 생성할 수 있다.

    // 정적 팩토리 메소드를 작성하는 시점에 궂이 구현체가 없어도 된다.
    // 서비스 제공자 프레임워크
    */

    public static void main(String[] args) {

        // 서비스 로더
        // 자바제공 정적 팩토리 메서드
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(it -> {
            System.out.println(it.getClass());
            System.out.println(it.hello());
        });

    }

}
