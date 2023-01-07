package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
  @Override
  public String toString() {
    return "Fruit";
  }
}

class Apple extends Fruit { 
  @Override
  public String toString() {
    return "Apple";
    }
}

class Grape extends Fruit {
  @Override
  public String toString() {
    return "Grape";
    } 
}

class Toy extends Fruit {
  @Override
  public String toString() {
    return "Toy";
    }
}

interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {};

class Box<T> {
  ArrayList<T> list = new ArrayList<T>();
  void add(T item) { list.add(item);     }
  T get(int i)     { return list.get(i); }
  int size()       { return list.size(); }
  @Override
  public String toString() { return list.toString(); }
  
}

public class Ex12_3 {
  public static void main(String[] args) {
    //원래는 아래와 같이 형변환을 해야하지만 생략해도 컴파일러가 해당 문장을 넣어줌
    //FruitBox<? extends Fruit> fiuitBox = (FruitBox<? extends Fruit>) new FruitBox<Fruit>();
    FruitBox<? extends Fruit> fruitBox = new FruitBox<Fruit>();
    FruitBox<? extends Fruit> appleBox = new FruitBox<Apple>();
    FruitBox<? extends Fruit> grapeBox = new FruitBox<Grape>();
    FruitBox<? extends Fruit> abox = new FruitBox<Apple>();
    
    // 형변환 가능 다만 경고발생 와일드카드
    FruitBox<Apple> appleBoxTemp = (FruitBox<Apple>)abox;
    
    Box b = null;
    Box<String> bStr = null;
    
    b = bStr; // Box<String> -> Box 가능하지만 but 경거
    bStr = b; // Box -> Box<String> 가능 but 경고
    //원시타입으로 변환보다 제네릭 타임의 클래스는 꼭제네릭을 명시한
    
    // 와일드 카드가 사용된 제네릭 타입으로는 형변환 가능 
    
//   Box<Object> obj = (Box<Object>)new Box<String(); // 형변환 불가능
//   Box<? extends Object> wBox = (Box<? extends Object>) new Box<String>(); // ok
  }
}
