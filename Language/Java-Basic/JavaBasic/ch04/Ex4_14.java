package ch04;

import java.util.Scanner;

public class Ex4_14 {
  public static void main(String[] args) {
    System.out.print("숫자를 입력하세요. (예: 12345)>");
    Scanner sr = new Scanner(System.in);
    int num = Integer.parseInt(sr.nextLine());
    int sum = 0;
    sr.close();

    while(num != 0) {
      sum += num %10;
      num /= 10;
    }

    System.out.printf("자리수 숫자의 합 -> %d", sum);


  }

}
