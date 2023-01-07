package ch13;

public class Ex13_6 {
  public static void main(String[] args) {
    ThreadEx6_1 th1 = new ThreadEx6_1();
    ThreadEx6_2 th2 = new ThreadEx6_2();
    
    
    // 우선순위는 1 ~ 10을 셋팅할 수 있다.
    // 우선순위는 1이 제일 낮은 우선순위 10이 제일 높은 순위이다 
    // 다만 쓰레드는 자바버추얼머신이 아닌 운영체제가 관리하기 때문에
    // 우선순위가 높다고 해서 꼭 빨리 실행되는건 아니다.
    // 다만 빨리 끝날 확률이 조금더 높을뿐이다.
    
    th2.setPriority(9);

    
    System.out.println("Priority of th1(-)" + th1.getPriority());
    System.out.println("Priority of th2(|)" + th2.getPriority());
    th1.start();
    th2.start();
  }

}

class ThreadEx6_1 extends Thread {
  @Override
  public void run() {
    for(int i = 0; i < 300; i++) {
      System.out.print("-");
      for(int x = 0; x < 10000000; x++);
    }
  }
}

class ThreadEx6_2 extends Thread {
  @Override
  public void run() {
    for(int i = 0; i < 300; i++) {
      System.out.print("|");
      for(int x = 0; x < 10000000; x++);
    }    
  }
}