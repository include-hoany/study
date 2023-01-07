package ch09;

import java.util.Objects;

public class Ex9_4 {
  static class Student{
    String name;
    int studentNumber;
    int age;
    StringBuffer temp;
    
    Student(String name, int snb, int age) {
      this.name = name;
      this.studentNumber = snb;
      this.age = age;
    }
    
    // equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야한다.
    @Override
    public int hashCode() {
      return Objects.hash(this.name, this.studentNumber, this.age);
    }
    
    @Override
    public boolean equals(Object std) {
        if(!(std instanceof Student)) return false;
        Student temp = (Student) std;
        return this.name.equals(temp.name) &&
               this.studentNumber == temp.studentNumber &&
               this.age == temp.age;
    }
    
    @Override
    public String toString() {
      return this.name;
    }
    
  }
  
public static void main(String[] args) {
  String str1 = new String("abc");
  String str2 = new String("abc");
  Student s1 = new Student("김연아", 1, 30);
  Student s2 = new Student("아이유", 2, 27);
  Student s3 = new Student("김연아", 1, 30);
  Student s4 = new Student("아이유", 2, 27);
  
  System.out.println(s1.equals(s3));
  System.out.println(s1.toString());
  System.out.println(s2.toString());
  System.out.println(s1.hashCode());
  System.out.println(s2.hashCode());
  System.out.println(s2.getClass().getSimpleName());
  System.out.println(str1.equals(str2));
  System.out.println(str1.hashCode());
  System.out.println(str1.hashCode());
}

}
