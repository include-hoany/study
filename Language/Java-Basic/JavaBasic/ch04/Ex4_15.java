package ch04;

import java.util.Scanner;

public class Ex4_15 {
  public static void main(String[] args) {
    int input = 0, answer = 0;
    Scanner sc = new Scanner(System.in);
    answer = (int)(Math.random() * 100) + 1;

    do {
      System.out.print("1과 100 사이에 정수값을 입력하세요.> ");
      input = Integer.parseInt(sc.nextLine());
      if(input > answer) {
        System.out.println("좀 더 작은 값 입니다.");
      } else if(input < answer) {
        System.out.println("좀 더 큰값 입니다.");
      }
    }while(input != answer);
    System.out.println("정답입니다.");
    sc.close();
  }

}
