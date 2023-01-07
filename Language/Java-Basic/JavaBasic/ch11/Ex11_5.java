package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex11_5 {
  public static void main(String[] args) {
    Collection list = new ArrayList();
    Collection list2 = new HashSet();
    Collection list3 = new TreeSet();
    
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    
    //iterator 는 일회용
    //한바퀴 돌리면 다시 iterator 호출
    Iterator it = list.iterator();
    
    while(it.hasNext()) {
      Object obj = it.next();
      String temp;
      if(obj instanceof String) temp = (String)obj;
      else continue;
      System.out.println(temp);
    }
    
    it = list.iterator();
        
    while(it.hasNext()) {
      Object obj = it.next();
      String temp;
      if(obj instanceof String) temp = (String)obj;
      else continue;
      System.out.println(temp);
    }
    
  }

}
