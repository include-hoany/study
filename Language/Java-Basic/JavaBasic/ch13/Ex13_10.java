package ch13;

public class Ex13_10 {
  public static void main(String[] args) {
    MyThread th1 = new MyThread("*");
    MyThread th2 = new MyThread("**");
    MyThread th3 = new MyThread("***");
    th1.start();
    //    th2.start();
    //    th3.start();


    try {
      Thread.sleep(2000);
      th1.suspend();
      Thread.sleep(2000);
      System.out.println("th1 일시정지");
      th1.suspend();
      Thread.sleep(3000);
      Thread.sleep(3000);
      System.out.println("th1 다시시작");
      th1.resume();
      //      th1.stop();
      //      th2.stop();
      Thread.sleep(2000);
      //      th3.stop();
      th1.stop();
      System.out.println("th1 종료");
    } catch(InterruptedException e) {

    }
  }


}

class MyThread implements Runnable {
  volatile boolean suspended = false ; // 쉽게 바뀌는 변수
  volatile boolean stopped = false; // 쉽게 바뀌는 변수
  Thread th;

  MyThread(String name) {
    th = new Thread(this, name); // Thread(Runnable r, String name)
  }

  void start() {
    th.start();
  }

  void stop() {
    stopped = true;
  }

  void suspend() {
    suspended = true;
  }

  void resume() {
    suspended = false;
  }

  @Override
  public void run() {
    while(!stopped) {
      if(!suspended) {
        System.out.println(Thread.currentThread().getName());
        try {
          Thread.sleep(1000);
        } catch(InterruptedException e) {

        }
      }
    }
  } // run
}
