package ch13;

public class Ex13_3 {
  static long startTime = 0;
  public static void main(String[] args) {
    ThreadEx331 th1 = new ThreadEx331();
    th1.start();
    startTime = System.currentTimeMillis();
    
    for(int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("|"));
    }
    System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime) + "\n");
  }

}

class ThreadEx331 extends Thread {
  @Override
  public void run() {
    for(int i = 0; i < 300; i++) {
      System.out.printf("%s", new String("-"));
    }
    System.out.print("소요시간 : " + (System.currentTimeMillis() - Ex13_3.startTime) + "\n");
  }
}
