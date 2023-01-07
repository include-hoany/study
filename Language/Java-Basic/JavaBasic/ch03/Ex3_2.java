package ch03;

public class Ex3_2 {
  public static void main(String[] args) {
    int i = 5, j = 0;

    j = i;
    i++; // 후위형
    System.out.printf("j=j++; 실행후, i=%d, j=%d%n", i, j);

    i = 5;
    j = 0;

    ++i; // 전위형
    j = i;
    System.out.printf("j=++i; 실행후, i=%d, j=%d", i, j);

  }

}
