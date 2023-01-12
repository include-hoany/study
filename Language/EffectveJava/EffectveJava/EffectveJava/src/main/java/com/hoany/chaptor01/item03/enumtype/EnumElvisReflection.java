package com.hoany.chaptor01.item03.enumtype;

import java.lang.reflect.Constructor;

public class EnumElvisReflection {

    public static void main(String[] args) {
        try {
            // Enum을 사용하면 리플렉션으로 생성자를 호출해도 리플렉션단에서 제약사항으로 막혀있다.
            Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
            System.out.println(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
