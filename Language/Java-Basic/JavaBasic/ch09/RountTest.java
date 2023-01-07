package ch09;

import java.util.ArrayList;

public class RountTest {
  public static void main(String[] args) {
    int i = Integer.parseInt("100");
    
    System.out.println("i="+Integer.parseInt("100"));
    System.out.println("i="+Integer.parseInt("100", 10)); // 10진수
    System.out.println("i="+Integer.parseInt("100", 2)); // 2진수
    System.out.println("i="+Integer.parseInt("100", 16)); // 16진수
    System.out.println("i="+Integer.parseInt("FF", 16)); // 16진수
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(100);
    list.add(new Integer(100));
    
    Integer iTemp = list.get(0);
    int iTepTwo = list.get(0);
    
    
  }

}
