package com.hoany.chaptor01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 생성자로 여러 인스턴스 만들기
public class ElvisReflection {

    public static void main(String[] args) {
        try {

            // 리플렉션으로 private한 생성자도 접근하여 싱글턴 패턴을 무력화시킬 수 있다.
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis.INSTANCE.sing();
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationError | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

}
