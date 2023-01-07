package ch06;

public class Ex6_2 {
  public static void main(String[] args) {

    Tv t1 = new Tv();
    Tv t2 = new Tv();
    System.out.printf("현재 채널은 %d 입니다.%n", t1.channel);
    System.out.printf("현재 채널은 %d 입니다.%n", t2.channel);

    t1.channel = 7;
    System.out.printf("t1의 채널값을 %d로 변경하였습니다.%n", 7);

    t2 = t1;
    System.out.printf("현재 채널은 %d 입니다.%n", t1.channel);
    System.out.printf("현재 채널은 %d 입니다.%n", t2.channel);

    t1.favoriteChannel = 2;
    System.out.printf("현재 채널은 %d 입니다.%n", t1.favoriteChannel);
    System.out.printf("현재 채널은 %d 입니다.%n", t2.favoriteChannel);

    Tv.favoriteChannel = 10;
    System.out.printf("현재 채널은 %d 입니다.%n", t1.favoriteChannel);
    System.out.printf("현재 채널은 %d 입니다.%n", t2.favoriteChannel);


  }

}
