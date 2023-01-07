package ch12;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList<Tv> list = new ArrayList<Tv>();
    list.add(new Tv());
    
    Tv t = list.get(0);
    
//    ArrayList<Integer> list = new ArrayList<Integer>(); // JDK 1.5 이후는 Object도 명시하는게 좋은 코드이다
//    list.add(10);
//    list.add(20);
//    list.add(30); // String 추가 제네릭 덕분에 타입체크가 강화됨
//    
//    Integer i = list.get(2); // 컴파일은 통과하지만 런타임 에러
//    System.out.println(list);
  }

}
