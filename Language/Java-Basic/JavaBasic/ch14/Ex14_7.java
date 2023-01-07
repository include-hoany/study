package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
  public static void main(String[] args) {
    Stream<String[]> strArrStrm = Stream.of(
        new String[] {"abc", "def", "jkl"},
        new String[] {"ABC", "GHI", "JKL"}
        );
    Stream<String> strStrm = strArrStrm.flatMap( (f) -> Arrays.stream(f) );
    strStrm.map(f -> f.toLowerCase())
    .distinct()
    .sorted()
    .forEach(f -> System.out.println(f));
    System.out.println();


    String[] lineArr = {
        "Believe or not It is true",
        "Do or do not There is no try"
    };

    Stream<String> lineStream = Arrays.stream(lineArr);
    // 스플릿 반환 구분자를 기준 배열로 반환
    lineStream.flatMap(line -> Arrays.stream(line.split(" +")))
    .map(f -> f.toLowerCase())
    .distinct()
    .sorted()
    .forEach(f -> System.out.println(f));

  }
}
