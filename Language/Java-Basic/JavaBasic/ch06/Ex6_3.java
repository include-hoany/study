package ch06;

public class Ex6_3 {
  public static void main(String[] args) {
    System.out.println("Card.width = " + Card.width);
    System.out.println("Card.height = " + Card.height);
    System.out.println();

    Card c1 = new Card("Heart", 7);
    Card c2 = new Card("Spade", 4);

    Card.printCard(c1);
    Card.printCard(c2);

    System.out.printf("%nCard height width 50, 80으로 변경%n%n");
    Card.width = 50;
    Card.height = 80;

    Card.printCard(c1);
    Card.printCard(c2);
  }

}

class Card {
  String kind; // 무늬
  int number; // 숫자

  static int width = 100; // 폭
  static int height = 250; // 높이

  Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }

  static void printCard(Card c) {
    System.out.printf("카드는 %s, %d이며, 크기는(%d, %d)%n",c.kind, c.number, c.height, c.width);
  }

}
