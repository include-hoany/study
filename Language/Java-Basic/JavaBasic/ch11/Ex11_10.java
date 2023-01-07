package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Ex11_10 {
  public static void main(String[] args) {
    //HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
    //같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
    //객체가 같은 객체인지 판별하는 equals(), hashCode()가 오버라이딩 되어있어야 한다
    
    Set set = new HashSet();
    
    for(int i = 0; set.size() < 6; i++) {
      int num = (int)(Math.random()*45) + 1;
      set.add(new Integer(num));
    }
    
    LinkedList list = new LinkedList(set);
    Collections.sort(list);
    System.out.println(list);
  }

}
