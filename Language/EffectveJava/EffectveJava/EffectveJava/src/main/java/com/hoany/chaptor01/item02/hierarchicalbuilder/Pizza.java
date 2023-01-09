package com.hoany.chaptor01.item02.hierarchicalbuilder;

import com.hoany.chaptor01.item02.builder.NutritionFacts;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


// 코드 2-4 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴

// 참고: 여기서 사용한 '시뮬레이트한 셀프 타임(simulated self-type)' 관용구는
// 빌더뿐 아니라 임의의 유동적인 계층구조를 허용한다.

public class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
