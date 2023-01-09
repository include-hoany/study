package com.hoany.chaptor01.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    /* 정적팩토리 메소드를 통해
    //  인터페이스를 다형성을 통해 객체를 생성할 수 있다.

    // 정적 팩토리 메소드를 작성하는 시점에 궂이 구현체가 없어도 된다.
    // 서비스 제공자 프레임워크
    */




    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 서비스 로더
        // 자바제공 정적 팩토리 메서드
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(it -> {
            System.out.println(it.getClass());
            System.out.println(it.hello());
        });

        /*
         *  클래스 로더를 통해 읽어온 클래스 정보(거울에 반사된 정보)를 사용하는기술
         *  리플렉션을 사용해 클래스를 읽어오거나. 인스턴스를 만들거나. 메소드를 실행하거나.
         *  필드의 값을 가져오거나 변경하는 것이 가능하다
         *
         *  언제 사용할까?
         *  특정 애노테이션이 붙어있는 필드 또는 메소드 읽어오기 (Junit, spring)
         *  특정 이름 패턴에 해당하는 메소드 목록 가져와 호출하기 (getter, setter)
         * */

        Class<?> aClass = Class.forName("com.hoany.chaptor01.item01.KoreaHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance();
        System.out.println(helloService.hello());

    }

}
