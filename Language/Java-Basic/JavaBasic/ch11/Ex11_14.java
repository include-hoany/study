package ch11;

import java.util.TreeSet;

public class Ex11_14 {
  public static void main(String[] args) {
    TreeSet set = new TreeSet();
    
    //TreeSet 은 범위의 값을 찾는데 유리하다
    
    String from = "b";
    String to   = "d";
    
    set.add("abc");
    set.add("alien");
    set.add("bat");
    set.add("car");
    set.add("Car");
    set.add("disc");
    set.add("dance");
    set.add("dZZZZ");
    set.add("dzzzz");
    set.add("elephant");
    set.add("elevator");
    set.add("fan");
    set.add("flower");
    
    System.out.println(set);
    System.out.println("range search : from " + from + " to " + to);
    System.out.println("result1 : " + set.subSet("b", "e")); // to는 범위에 안들어감
    System.out.println("result2 : " + set.subSet(from, to+"zzz")); // 편법은로 dzz하면 d도 들어감
    
  }

}
