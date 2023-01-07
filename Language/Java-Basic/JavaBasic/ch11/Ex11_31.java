package ch11;

import java.util.Arrays;
import java.util.Comparator;


public class Ex11_31 {
  public static void main(String[] args) {
    String[] strArr = {"cat", "Dog", "lion", "tiger"};
    Arrays.sort(strArr);
    System.out.println("strArr= " + Arrays.toString(strArr));
    // 대소문자 구별하지 않고 정렬
    // 원래 정렬은 대문자가 앞에 정렬됨
    Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); 
    System.out.println("strArr= " + Arrays.toString(strArr));
    
    //정렬기준을 넣어줄수 있음
    //정렬기준을 반대로 새로운 규칙을 넘겨줄수 있음
    Arrays.sort(strArr, new Descending());
    System.out.println(Arrays.toString(strArr));
    
    // 정렬기준을 제공하면 자바 자체 라이브러리를 통해 버블정렬, 삽입정렬, 퀵정렬 등이 가능하다.
  }

}

// Comparator implements 한 클래스를 구현하여 넘겨줌
class Descending implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    if(o1 instanceof Comparable && o2 instanceof Comparable) {
      Comparable c1 = (Comparable)o1;
      Comparable c2 = (Comparable)o2;
      return c1.compareTo(c2) * -1;
    }
    return -1;
  }
}

