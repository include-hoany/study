package ch04;

public class ex4_11 {
  public static void main(String[] args) {

    for(int i = 2; i < 10; i++) {
      for(int j = 1; j < 10; j++) {
        System.out.printf("%d * %d = %d%n", i, j, i*j);
      }
      System.out.println();
    }

    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.printf("%c", '*');
      }
      System.out.println();
    }

    System.out.println();

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
