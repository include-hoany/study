package ch06;

import java.util.Arrays;

class staticBlock{
  static int[] arr = new int[10];

  int randomNumber;

  // 클래스 변수 복잡 초기화
  static {
    for(int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 100) + 1;
    }
  }
  //인스턴스 변수 복잡 초기화
  {
    this.randomNumber = (int)(Math.random() * 100) - 1;
  }
}

public class staticBlockTest {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(staticBlock.arr));

    staticBlock sb1 = new staticBlock();
    staticBlock sb2 = new staticBlock();

    System.out.println(sb1.randomNumber);
    System.out.println(sb2.randomNumber);


  }
}
