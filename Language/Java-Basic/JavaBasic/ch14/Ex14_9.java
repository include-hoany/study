package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
  public static void main(String[] args) {
    String[] strArr = {
        "Inheritance", "Java", "Lamda", "stream",
        "OptionalDouble", "IntStream", "count", "sum"
    };

    //직렬처리
    //    Stream.of(strArr).forEach(System.out::println);

    //병렬처리 순서 노상관
    //    Stream.of(strArr).parallel().forEach(System.out::println);

    // 병렬처리라도 순서 지키는 방법
    Stream.of(strArr).parallel().forEachOrdered(System.out::println);

    // 프리디킷 람다 조건에 하나라도 해당된다면 false
    boolean noEmptyStr = Stream.of(strArr).noneMatch(s ->s.length()==0);

    // 필터조건에 맞는것중 가장 첫번째 값
    Optional<String> sWord = Stream.of(strArr).filter(s ->s.charAt(0)=='s').findFirst();

    System.out.println("noEmptyStr="+noEmptyStr);
    System.out.println("sWord="+sWord.get());

    // Stream<String>을 IntStream으로 변환. IntStream기본형 스트림으로 변환
    Stream<Integer> intStream1_2 = Stream.of(strArr).map(s -> s.length());
    new Random().ints(30, 1, 46).distinct().limit(3).forEach(s -> System.out.println("랜덤값:"+s));


    // Stream<String>을 IntStream으로 변환
    //리듀스는 최종연산자!!
    IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

    int max = intStream1.reduce(Integer.MIN_VALUE, (a, b) -> a < b ? b : a );
    int min = intStream2.reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a);

    OptionalInt tmax = intStream3.reduce(Integer::max);
    OptionalInt tmin = intStream4.reduce(Integer::min);

    System.out.println("1count="+max);
    System.out.println("1sum="+min);
    System.out.println("max="+tmax.getAsInt());
    System.out.println("max="+tmin.getAsInt());

  }
}
