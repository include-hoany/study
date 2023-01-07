package ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex9_2 {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(new File("ch09/data.txt"));
      int sum = 0;
      int count = 0;
      
      while(sc.hasNextInt()) {
        sum += sc.nextInt();
        count++;
      }
      System.out.println("sum: " + sum);
      System.out.println("avg: " + sum/count );
      
    } catch (FileNotFoundException e) {
      System.out.println("파일이 존재하지 않습니다.");
//      e.printStackTrace();
    }
  }

}
