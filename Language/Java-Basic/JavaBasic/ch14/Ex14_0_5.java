package ch14;

import java.util.Random;

public class Ex14_0_5 {
  public static void main(String[] args) {
    //    IntStream.rangeClosed(1, 10).map(s -> s+"번째").forEach(null);

    boolean temp = new Random().ints(10, 1, 16).distinct().filter(s -> (s%2)==0).allMatch(s -> (s%2)==0);
    System.out.println(temp);



  }

}
