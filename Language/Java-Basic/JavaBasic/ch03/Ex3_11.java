package ch03;

public class Ex3_11 {
  public static void main(String[] args) {
    long result = Math.round(4.52);


    // 소수 3번째 자리에서 반올림 하기
    double pi = 3.141592;
    double shortPi = Math.round(pi * 1000) / 1000.0;

    System.out.println(shortPi);


    // 소수점 3번째 자리부터 버림 만들기
    pi = (int)(pi * 1000) / 1000.0;
    System.out.println(pi);

    int i = 10;
    int j = 10;
    i *= 10 + j;
    System.out.println(i);


    boolean temp_boolean = "YES".equalsIgnoreCase("yEs");
    System.out.printf("%b", temp_boolean);
  }

}
