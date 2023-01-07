package ch04;

import java.util.Arrays;
import java.util.Collections;

public class Ex4_7 {
  public static void main(String[] args) {
    //    int num = 0;
    //
    //    // -5 ~ 5 범위
    //    for(int i = 1; i <= 20; i++) {
    //      System.out.println((int)(Math.random()*11)-5);
    //    }


    Integer[] numbers = new Integer[10];

    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = (int)(Math.random() * 10) + 1;
      for(int j = 0; j < i; j++) {
        if(numbers[j] == numbers[i]) {
          numbers[i] = (int)(Math.random() * 10) + 1;
          j = 0;
        }
      }
    }

    Arrays.sort(numbers, Collections.reverseOrder());
    System.out.println(Arrays.toString(numbers));
  }
}
