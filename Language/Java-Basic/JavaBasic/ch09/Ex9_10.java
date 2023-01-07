package ch09;

public class Ex9_10 {
  public static void main(String[] args) {
    
    //형변환
    //valueOf 가 상대적으로 속도가 빠름
    
    //StringBuffer 동기화 // 멀티스레드 환경에서 사용 단 싱글스레드 작업만 한다면 성능이 떨어질수 있음
    //StringBuilder 동기화 안되어있음 싱글스레드 작업만 한다면 Stringbuilder를 사용하는 편이 좋음
    
    int iVal = 100;
    String strVal = String.valueOf(iVal);
    
    double dVal = 200.0;
    String strVal2 = dVal + "";
    
    double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
    double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
    
    System.out.println(sum);
    System.out.println(sum2);
    
    new Thread(() -> {
      try {
        for(int i = 0; i < 10; i++) {
          Thread.sleep(1000);
          System.out.println("Thread 1");
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
    
    new Thread(() -> {
      try {
        for(int i = 0; i < 10; i++) {
          Thread.sleep(1100);
          System.out.println("Thread 2");
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }).start();
    
    System.out.println("main exit");
  }

}
