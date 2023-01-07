package ch12;

public class Ex12_7Annotation {
  public static void main(String[] args) {
    Child c = new Child();
    c.parentMethod();
  }

}

class Parent {
  void parentMethod() { } 
}

class Child extends Parent {
  
  //애노테이션
  // 이 메소드는 오버라이드 된 메소드이다
  @Override
  @Deprecated
  void parentMethod() { }
  
  //앞으로 사용하지 않을 것을 권장하는 필드나 메소드에 붙인다.
//  @Deprecated
//  void getTest() {
//    
//  }
  
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
  @SuppressWarnings("deprecation")
  void test(); // 추상메소드
//  void check(); // 추상메소드 
}
