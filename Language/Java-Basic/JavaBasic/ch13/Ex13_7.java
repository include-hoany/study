package ch13;

public class Ex13_7 implements Runnable {
  static boolean autoSave = false;

  public static void main(String[] args) {
    Thread t = new Thread(new Ex13_7());
    t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다.
    // 데몬 쓰레드일경우 메인 일반쓰레드가 종료되면 데몬쓰레드도 종료된다.
    t.start();

    for(int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {}
      System.out.println(i);
      if(i == 5) autoSave = true;
    }
    System.out.println("프로그램을 종료합니다.");
  }

  @Override
  public void run() {
    while(true) { // 무한루프
      try {
        Thread.sleep(3 * 1000); // 3초마다
      } catch(InterruptedException e) {}
      //autoSave의 값이 true 이면 autoSave()호출한다.
      if(autoSave) autoSave();
    }
  }

  public void autoSave() {
    System.out.println("작업파일이 자동 저작되었습니다.");
  }


}
