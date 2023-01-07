package ch12;

import java.util.HashMap;

public class Ex12_2 {
  public static void main(String[] args) {
    HashMap<String ,Student> map = new HashMap<String, Student>(); // JDK1.7부터 생성자에 타입지정 생략 가능
    map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
   
    
    Student s = map.get("자바왕"); // 해쉬맵을 만들때 타입형식이 지정되어있기 때문에 형변환이 필요하지 않음
    System.out.println(s.name);
    
//    ArrayList<Student> list = new ArrayList<Student>();
//    list.add(new Student("자바왕", 1, 1));
//    list.add(new Student("자바짱", 1, 2));
//    list.add(new Student("홍길동", 2, 1));
//    
//    Iterator<Student> it = list.iterator(); // 제네릭 타입을 지정하지 않으면 추가적인 형변환이 필요하다
//    while(it.hasNext()) {
//      System.out.println(it.next().name);
////      Student s = it.next();
////      System.out.println(s.name);
//    }
  }

}

class Student {
  String name = "";
  int ban;
  int no;
  int kor;
  int eng;
  int math;
  
  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
}
