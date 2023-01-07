package ch07;

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Circle extends Point {
  int r;
  Circle(int x, int y, int r) {
    super(x, y);
    this.r = r;
  }
}

public class InheritanceTest {
  public static void main(String[] args) {
    //    Circle c = new Circle(1, 2, 3);
    //    System.out.println(c.x);
    //    System.out.println(c.y);
    //    System.out.println(c.r);

    Point a = new Circle(1, 2, 3);
    System.out.println(a.x + " " + a.y + " ");
    Circle temp = (Circle)a;
    System.out.println(temp.x + " " + temp.y + " " + temp.r);


    //    String temp = "아이폰-갤럭시-홍미-갤럭시노트-지프로-샤오미";
    //    String[] stringArr = temp.split("-");
    //
    //    for(String item : stringArr) {
    //      System.out.println(item);
    //    }
  }
}
