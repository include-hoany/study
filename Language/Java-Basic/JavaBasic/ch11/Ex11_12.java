package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
  public static void main(String[] args) {
    HashSet setA = new HashSet();
    HashSet setB = new HashSet();
    HashSet setHab = new HashSet();
    HashSet setKyo = new HashSet();
    HashSet setCha = new HashSet();
    
    setA.add("1");
    setA.add("2");
    setA.add("3");
    setA.add("4");
    setA.add("5");
    
    System.out.println("A = " + setA);
    
    
    setB.add("4");
    setB.add("5");
    setB.add("6");
    setB.add("7");
    setB.add("8");
    
    System.out.println("B = " + setB);
    
    Iterator it = setB.iterator();
    while(it.hasNext()) {
      Object tmp = it.next();
      if(setA.contains(tmp)) {
        setKyo.add(tmp);
      }
    }
    
    it = setA.iterator();
    while(it.hasNext()) {
      Object tmp = it.next();
      if(!setB.contains(tmp)) {
        setCha.add(tmp);
      }
    }
    
    it = setA.iterator();
    while(it.hasNext()) {
      setHab.add(it.next());
    }
    
    it = setB.iterator();
    while(it.hasNext()) {
      setHab.add(it.next());
    }
    
    System.out.println("A kyo B" + setKyo);
    System.out.println("A Hab B" + setHab);
    System.out.println("A - B" + setCha);
    
    //직접 구현한것 외 제공되는 메서드 집합연산
    
    //교집합
//    setA.retainAll(setB);
//    System.out.println(setA);
    
    //합집합
//    setA.addAll(setB);
//    System.out.println(setA);
    
    //차집합
//    setA.removeAll(setB);
//    System.out.println(setA);    
    
  }

}
