package ch13;

public class Ex13_1 {
  public static void main(String[] args) {
    ThreadEx1_1 t1 = new ThreadEx1_1();
    Thread t2 = new Thread(new ThreadEx1_2());
    
    t1.start();
    t2.start();
    
  }

}

class ThreadEx1_1 extends Thread { // Thread 클래스 상속 구현
  @Override
  public void run() {
    for(int i = 0; i < 500; i++) {
      System.out.print(1);
    }
  }
}


class ThreadEx1_2 implements Runnable { // Runnable 인터페이스를 구현해서 쓰레드를 구현

  @Override
  public void run() {
    for(int i = 0; i < 500; i++) {
      System.out.print(2);
    }
    
  }
  
}

