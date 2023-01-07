package ch13;

import javax.swing.JOptionPane;

public class Ex13_9 {
  public static void main(String[] args) {
    ThreadEx9_1 th1 = new ThreadEx9_1();
    th1.start();

    System.out.println("isInterrupted() : " + th1.isInterrupted());
    String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
    System.out.println("입력하신 값은 " + input + "입니다.");
    th1.interrupt(); // interrupt() 호출하면, interrupted 상태가 true가 된다.
    System.out.println("isInterrupted() : " + th1.isInterrupted());

    //main쓰레드가 interrupt되었는지 확인
    System.out.println("isInterrupted() : " + Thread.interrupted());
  }

}

class ThreadEx9_1 extends Thread {
  @Override
  public void run() {
    int i = 10;
    while(i!=0 && !isInterrupted()) {
      System.out.println(i--);
      for(long x = 0;x<2500000000L; x++) {
      }
    }

    // isInterrupted()는 인터럽트 되었는지 확인만 하지만 interrupted는인터럽트 확인을 하고 값을 false로 변경한다
    // interrupted는 static
    System.out.println("isInterrupted() : " + Thread.interrupted());
    System.out.println("isInterrupted() : " + Thread.interrupted());
    System.out.println("카운트가 종료되었습니다.");

  }
}
