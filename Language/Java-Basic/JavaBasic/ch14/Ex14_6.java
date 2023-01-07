package ch14;

import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {
  public static void main(String[] args) {
    File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

    Stream<File> fileStream = Stream.of(fileArr);

    // map() 으로 Stream<File>을 Stream<String>으로 변환
    //    Stream<String> filenameStream = fileStream.map((f) -> f.getName());
    //    Stream<String> filenameStream = fileStream.map((File::getName));
    //    filenameStream.forEach((f) -> System.out.println(f));

    //    fileStream = Stream.of(fileArr);
    //    filenameStream = fileStream.map((File::getName));
    //    filenameStream.filter((f) -> f.contains("."))
    //    .map((f) -> f.substring(f.indexOf(".")+1))
    //    .map((f) -> f.toUpperCase()).distinct().forEach((f) -> System.out.print(f));

    //    System.out.println();


    fileStream = Stream.of(fileArr);
    fileStream.map(f -> f.getName())
    .peek(System.out::println)
    .filter(f -> f.contains("."))
    .peek(System.out::println)
    .map(f -> f.substring(f.indexOf(".")+1))
    .peek(System.out::println)
    .distinct()
    .peek(System.out::println)
    .map(f -> f.toUpperCase())
    .forEach( f -> System.out.println(f));


    // peek 중간 작업결과 확인 foreach와 비슷하지만 최종연산이 아닌 중간연산임

  }

}
