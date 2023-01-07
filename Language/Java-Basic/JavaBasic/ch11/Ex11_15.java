package ch11;

import java.util.TreeSet;

public class Ex11_15 {
  public static void main(String[] args) {
    

    
//  트리셋은 정렬과 범위검색 좋음 
    //단 CRUD 느림
    TreeSet set = new TreeSet();
    int[] score = {80, 95, 50, 35, 45, 65, 10, 100, 40};
    
    for(int i = 0; i < score.length; i++) {
      set.add(new Integer(score[i]));
    }
    
    // 50은 범위에 안들어간다
    System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
    // 50 범위에 들어간다
    System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
    // 40과 80사이의 큰 값 80은 안들어감
    System.out.println("40과 80사이의 값 : " + set.subSet(40, 80));
  }

}
