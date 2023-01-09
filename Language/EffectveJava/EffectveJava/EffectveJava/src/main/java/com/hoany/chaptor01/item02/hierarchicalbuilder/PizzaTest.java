package com.hoany.chaptor01.item02.hierarchicalbuilder;

import static com.hoany.chaptor01.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.hoany.chaptor01.item02.hierarchicalbuilder.Pizza.Topping.*;

public class PizzaTest {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(HAM).build();
    }
}
