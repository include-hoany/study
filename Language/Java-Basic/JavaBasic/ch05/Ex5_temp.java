package ch05;

import java.util.Arrays;

public class Ex5_temp {
  public static void main(String[] args) {
    int[] temp = {77,5,2,1,5,10};

    if(temp.length < 10) {
      System.out.println(temp);
      System.out.println(Arrays.toString(temp));
      int[] temp_arr = new int[10];
      System.arraycopy(temp, 0, temp_arr, 2, temp.length);
      temp = temp_arr;
      System.out.println(temp_arr);
      System.out.println(temp);
      System.out.println(Arrays.toString(temp));

      //최대값
      int max = Arrays.stream(temp).max().getAsInt();
      //최소값
      int min = Arrays.stream(temp).min().getAsInt();

      System.out.println(max);
      System.out.println(min);
    }

    for(int i = 0; i < temp.length; i++) {
      System.out.printf("%d ", temp[i]);
    }
    System.out.println();


    int[] loto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int i = 0; i < 100; i++) {
      int n = (int)(Math.random() * 10);
      int tmp = loto[0];
      loto[0] = loto[n];
      loto[n] = tmp;
    }

    System.out.println(Arrays.toString(loto));
    
  }

}
