package ch12;

public class Ex12_3_2 {
  public static void main(String[] args) {
    FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
    FruitBox<Apple> appleBox = new FruitBox<Apple>();
    FruitBox<Grape> grapeBox = new FruitBox<Grape>();
    
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    appleBox.add(new Apple());
//    appleBox.add(new Grape()); // Grape 는 Apple에 자손이 아님
    grapeBox.add(new Grape());
    
    
    // static 멤버는 제네릭을 사용할 수 없다 왜냐하면
    // 객체가 생설할때마다 타입이 바뀌는데 공통적으로 접근이 가능한
    // static 멤버가 매번 바뀌면 안되기 때문
    // 배열 선언은 제네릭 가능하지만
    // 제네릭으로 new 연산이 불가능 하다

  }
}
