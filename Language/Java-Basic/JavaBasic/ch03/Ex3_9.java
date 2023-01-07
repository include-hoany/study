package ch03;

public class Ex3_9 {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    // int * int 오버풀로
    long c = a * b;
    System.out.println(c);

    //
    c = (long)a * b;

    System.out.println(c);
  }

}
