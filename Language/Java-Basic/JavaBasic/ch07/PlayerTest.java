package ch07;

abstract class Player {
  abstract void play(int pos);
  abstract void stop();
}

abstract class AudioPlayer extends Player {
  @Override
  void play(int pos) {
    System.out.println(pos+"위치부터 play합니다.");
  }
  @Override
  void stop() {
    System.out.println("재생을 멈춥니다.");
  }
}

class CdPlayer extends AudioPlayer {
}

public class PlayerTest {
  public static void main(String[] args) {
    //    Player p = new player();

    Player ap = new CdPlayer();
    ap.play(100);
    ap.stop();
  }

}
