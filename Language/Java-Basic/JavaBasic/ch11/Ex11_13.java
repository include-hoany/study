package ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public abstract class Ex11_13 {
  public static void main(String[] args) {
    Set set = new TreeSet();
    
//    for(int i = 0; set.size() < 6; i++) {
//      int num = (int)(Math.random()*45) + 1;
//      set.add(num); // 트리는 비교하며 삽입
      set.add(new Test()); // 비교기준이 없어서 에러남
      set.add(new Test());
      set.add(new Test());
      set.add(new Test());
      set.add(new Test());
//    }
      
      // 트리셋은 비교 Comparable, Comparator구현해서 넣어줘야함
      // 비교기준을만들어 줘야함
    
    System.out.println(set);
  }

}

class Test implements Comparable {
  @Override
  public int compareTo(Object o) {

    return -1;
  } 
}
class TestComp implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    return -1 ;
  }
  
}