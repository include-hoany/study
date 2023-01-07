package ch14;

import java.util.Optional;

public class Ex14_0_4 {
  public static void main(String[] args) {
    //    int[] arr = null;
    int[] arr = new int[0]; // NullPointException.. 발생방지
    System.out.println("arr.length="+arr.length);


    Optional<String> opt = null; // 널값 셋팅을 해도 에러는 안나지만 바람직하지 않음..
    opt = Optional.empty();
    //    opt = Optional.of("ABC");

    System.out.println("opt="+opt);
    //    System.out.println("opt="+opt.get()); // get은 잘 안씀..

    String str = "";

    //    try {
    //      str = opt.get(); // 예외발생
    //    } catch (Exception e) {
    //      str = "";
    //    }

    //    str = opt.orElse(""); // Optional에 저장된 값이 null이면 ""반환
    str = opt.orElseGet(() -> new String("EMPTY")); // 람다식 지정 가능 서플라이 함수
    System.out.println("str="+str);

  }

}
