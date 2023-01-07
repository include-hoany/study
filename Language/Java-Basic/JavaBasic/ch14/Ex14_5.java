package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5 {
  public static void main(String[] args) {
    Stream<Student> studentStream = Stream.of(
        new Student("이자바", 3, 300),
        new Student("김자바", 1, 200),
        new Student("안자바", 2, 100),
        new Student("박자바", 2, 150),
        new Student("소자바", 1, 200),
        new Student("나자바", 3, 290),
        new Student("감자바", 3, 180)
        );

    //    studentStream.sorted(Comparator.comparing(Student::getBan) // 반별정렬
    //        .thenComparing(Comparator.naturalOrder()).reversed()) // 기본 정렬
    //    .forEach(System.out::println);

    //람다식으로
    studentStream.sorted(Comparator.comparing((Student s) -> s.getBan()).reversed()
        .thenComparing(Comparator.comparing((Student s) -> s.getTotalScore()).reversed()))
    .forEach(System.out::println);

  }

}

class Student implements Comparable<Student> {
  String name;
  int ban;
  int totalScore;

  Student(String name, int ban, int totalScore) {
    this.name = name;
    this.ban = ban;
    this.totalScore = totalScore;
  }

  String getName() { return name; }
  int getBan() { return ban; }
  int getTotalScore() { return totalScore; }


  @Override
  public String toString() {
    return String.format("%s, %d, %d", this.name, this.ban, this.totalScore);
  }

  @Override // 총점 내림차순을 기본으로 정렬한다.
  public int compareTo(Student s) {
    return s.totalScore - this.totalScore;
    //음수 왼쪽 크면 음수 오른쪽이 크면 양수 같으면 0!!
  }

}
