package ch09;

public class Ex9_22_Math {
  
  public static void main(String[] args) {
    //반올림
    int tempNumber = (int)Math.round(9075.52);
    double tempDouble = Math.round(9075.52) / 100.0;
    System.out.println(tempNumber);
    System.out.println(tempDouble);
    
    
    //절대갑 abs
    int absNumber = Math.abs(-500);
    System.out.println(absNumber);
    
    //올림 
    System.out.println(Math.ceil(11.11));
    
    //버림
    System.out.println(Math.floor(-11.11));
    
    //최대값
    //단 두개의 값만 확인
    System.out.println(Math.max(100, 200));
    
    //작은값
    //단 두개의 값만 확인
    System.out.println(Math.min(100, 200));
    
    //반올림 했을때 짝수가 아니면 버림
    System.out.println(Math.rint(2.5));
    
    //반올림
    System.out.println(Math.round(1.2));
    System.out.println(Math.round(1.5));
    System.out.println(Math.round(1.4));
    
    // etc
    System.out.println(new Integer(100).toString().getClass().getSimpleName());
  }

}
