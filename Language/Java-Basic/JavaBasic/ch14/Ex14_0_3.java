package ch14;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_3 {
  public static void main(String[] args) {

    // List, Collection -> Stream
    //    List<Integer> list = Arrays.asList(1,2,3,4,5);
    //    Stream<Integer> intStream = list.stream(); // list를 Stream 으로 생성
    //    intStream.forEach(System.out::print); // forEach는 최종연산

    // Stream은 1회용  Stream에 대해 최종연산을 수행하면 Stream Stream이 닫힘
    //    intStream = list.stream(); // list로부터 스트림 생성
    //    intStream.forEach(System.out::print);

    //객체 배열로부터 스트림 생성하기
    String[] strArr = new String[] {"a", "b", "c", "d"};

    Stream<String> strStream = Stream.of(new String[]{"a", "b", "c", "d"});
    strStream.forEach(System.out::println);
    Stream<String> strStream2 = Arrays.stream(strArr);
    strStream2.filter(i -> i.equals("a")).forEach(i -> System.out.print(i+" "));

    //    Stream.of(strArr).filter( i -> i.equals("a")).forEach(System.out::println);
    //
    //    int[] intArr = {1,2,3,4,5};
    //    Arrays.stream(intArr).filter(i -> (i&0b1) == 0).forEach(System.out::println);

    // Random 무한 스트림 크기 지정안하면 무한난수 생성
    new Random().ints(6, 1, 46).distinct().forEach(i -> System.out.print(i + " "));
    //    strArr10 = Stream.of(strArr10).map(i -> "ID: "+i).toArray(String[]::new);
    //    System.out.println(Arrays.toString(strArr10));
    //    Stream.iterate(1, n -> n+1).limit(10).forEach(i -> System.out.println(i + " "));

    Stream<Double> randomStream = Stream.generate(Math::random);


    // Iterate see UnaryOperator 항연산자
    Stream<Integer> intStream;
    Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);

    // Stream Generate Supplier
    Stream<Integer> onStream = Stream.generate(() -> 1);
    onStream.limit(10).forEach(System.out::println);

    // 중간연산자

    // skpi, limit
    IntStream intStream2 = IntStream.rangeClosed(1, 10);
    intStream2.skip(3).limit(5).forEach(i -> System.out.print(i+" "));
    System.out.println();

    // distinct 중복제거
    IntStream intStream3 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
    intStream3.distinct().forEach(i -> System.out.print(i + " "));
    System.out.println();

    // filter 조건에 충적되는 인자만 뽑아내기
    IntStream intStream4 = IntStream.rangeClosed(1, 10);
    intStream4.filter(i -> (i%2)==0).forEach(i -> System.out.print(i + " "));
    System.out.println();

    // sorted
  }

}
