package ch04;

public class Ex4_19 {
  public static void main(String[] args) {
    loop :
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
          if(i == 3 && j== 3) {
            break loop;
          }
        }
        System.out.println(i);
      }
  }

}
