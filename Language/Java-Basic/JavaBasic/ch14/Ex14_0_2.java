package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0_2 {
  public static void main(String[] args) {
    //메서드 참조 Classname::method
    Function<String, Double> f = Double::valueOf;
    Function<Double, String> f2 = String::valueOf;
    Function<String, String> f3 = f.andThen(f2);

    System.out.println(f3.apply("3.14").getClass().getSimpleName());

    Supplier<MyClass> s = () -> new MyClass();
    Supplier<MyClass> s2 = MyClass::new;

    Function<Integer, MyClass2> ss = (i) -> new MyClass2(i);
    Function<Integer, MyClass2> ss2 = MyClass2::new;

    MyClass mc = s2.get();
    System.out.println(mc.getClass().getSimpleName());

    MyClass2 mc2 = ss2.apply(100);
    System.out.println(mc2.iv);

    Function<Integer, int[]> arr = int[]::new; // 메서드 참조
    int[] temparr = arr.apply(100);
    System.out.println(temparr.length);

  }

}

class MyClass{

}

class MyClass2{
  int iv;

  MyClass2(int iv) {
    this.iv = iv;
  }

}
