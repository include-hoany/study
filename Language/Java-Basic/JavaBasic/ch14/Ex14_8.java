package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {
  public static void main(String[] args) {
    Optional<String> optStr = Optional.of("abcde");
    Optional<Integer> optInt = optStr.map(String::length);
    System.out.println("optStr="+optStr.get());
    System.out.println("optInt="+optInt.get());

    int result1 = Optional.of("123")
        .filter(x -> x.length() > 0)
        .map(Integer::parseInt).get();

    int result2 = Optional.of("")
        .filter(x -> x.length() > 0)
        .map(Integer::parseInt).orElse(-1);

    System.out.println("result1="+result1);
    System.out.println("result2="+result2);


    Optional.of("456").map(Integer::parseInt)
    // ifPresent는 옵셔널 값이 Null이 아니면 실행 람다식 매개변수
    .ifPresent(x -> System.out.printf("result3=%d%n", x));

    OptionalInt optInt1 = OptionalInt.of(0); // 0을저장
    OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체 생성

    System.out.println(optInt1.isPresent()); // true
    System.out.println(optInt2.isPresent()); // false

    System.out.println(optInt1.getAsInt());
    // get은 NoSuchElementException 발생 때문에 안씀
    //    System.out.println(optInt2.getAsInt()); // 에러 값이 초기화 된적이 없기때문에
    System.out.println(optInt2.orElse(-1)); // 만약 널값이라면 -1출력하라
    System.out.println("optInt1="+optInt1);
    System.out.println("optInt1="+optInt2);
    System.out.println("optInt1.equals(optInt2)?=" + optInt1.equals(optInt2));
  }

}
