package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    list.add(4);
    list.add(4);
    list.add(4);
    
    System.out.println(Arrays.toString(list.toArray()));
    
    list.remove(new Integer(4));
    list.remove(new Integer(4));
    System.out.println(Arrays.toString(list.toArray()));
    
    // ArrayList 동기화 처리 안되어있음
    // Vector 동기화 처리 되어있음
    
    // ArrayList() // 기본 생성자
    // ArrayList(Collection c) // 콜렉션 생성자
    // ArrayList(int initialCapacity) // 배열길이 매개변수 생성자
    // capacity가 10인 어레이리스트 생성
    ArrayList list1 = new ArrayList(10);
    // ArrayList는 객체만 저장 가능하지만  AutoBox 참조형으로 컴파일러가 바꿔줌
    list1.add(5);
    list1.add(new Integer(4));
    list1.add(new Integer(2));
    list1.add(new Integer(0));
    list1.add(new Integer(1));
    list1.add(new Integer(3));
    
    ArrayList list2 = new ArrayList(list1.subList(1, 4));
    
//    System.out.println(Arrays.toString(list1.toArray()));
//    System.out.println(Arrays.toString(list2.toArray()));
    
    //정렬 Collections는 유틸 클래스
    Collections.sort(list1);
    Collections.sort(list2);
    
//    System.out.println(Arrays.toString(list1.toArray()));
//    System.out.println(Arrays.toString(list2.toArray()));
    
    // 해당 어레이리스트에 list2의 모든 요소가  list1존재하는지 확인
//    System.out.println(list1.containsAll(list2));
    
    list2.add("B");
    list2.add("C");
    list2.add(3, "A");
    list2.set(3, "AA");
//    System.out.println(Arrays.toString(list1.toArray()));
//    System.out.println(Arrays.toString(list2.toArray()));
    
//    System.out.println(list1.containsAll(list2));
    
    list1.add(0, "1");
    
//    System.out.println(list1.indexOf(new Integer(1)));
//    System.out.println(Arrays.toString(list1.toArray()));
    list1.remove(new Integer(1));
//    list1.remove(0);
//    System.out.println(Arrays.toString(list1.toArray()));
    list1.add(new Integer(4));
    
    // ArrayList.retainAll() 두 어레이 리스트에서 겹치는 부분만 남기고 삭제
    System.out.println(Arrays.toString(list1.toArray()));
    System.out.println(Arrays.toString(list2.toArray()));
    list1.retainAll(list2);
    
    System.out.println(Arrays.toString(list1.toArray()));
    System.out.println(Arrays.toString(list2.toArray()));
    
    //ArrayList 는 끝에있는 값부터 지우는게 좋음
    //왜냐하면 중간에 있는 값을 지워면 뒤에있던 값들을 앞으로 쉬프트 하기때문에
    //인덱스를 놓치는 경우가 발생한다
  
  }

}
