package ch06;

public class Ex6_1 {
  public static void main(String[] args) {
    Tv t;
    t = new Tv();
    t.channel = 7;
    t.channelDown();
    System.out.printf("현재 채널은 %d 입니다.%n", t.channel);

  }

}

class Tv {
  // 속성
  String color;
  boolean power;
  int channel;
  static int favoriteChannel;
  // 메서드
  void power() { power = !power; }
  void channelUp() { ++channel; }
  void channelDown() { --channel; }
}
