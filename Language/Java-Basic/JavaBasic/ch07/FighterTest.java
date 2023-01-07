package ch07;

abstract class Unit{
  int x, y;
  abstract void move(int x, int y);
  void stop() {
    System.out.println("멈춥니다.");
  }
}

interface Fightable {
  // 인터페이스의 모든 메서드는 public abstract 생략된거임
  void move(int x, int y);
  void attack(Fightable f);
}

class Fighter extends Unit implements Fightable {

  //오버라이딩 규칙: 조상보다 접근제어자 범위가 좁으면 안된다.
  @Override
  public void move(int x, int y) {
    System.out.printf("%d이동 %d이동%n", x, y);
  }

  @Override
  public void attack(Fightable f) {
    System.out.println(f + "를 공격");
  }

  Fightable getFightable() {
    Fighter f = new Fighter();
    return f;
  }
}

public class FighterTest {
  public static void main(String[] args) {
    //    Fighter f = new Fighter();
    Fighter f = new Fighter();
    Fightable f3 = f.getFightable();

    //    Unit f2 = new Fighter();
    //    f.move(100, 200);
    //    f.attack(new Fighter());
    //    f.attack(f);
    //    f2.move(300, 400);
    //    f2.stop();
  }

}
