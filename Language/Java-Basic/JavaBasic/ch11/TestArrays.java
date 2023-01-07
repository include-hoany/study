package ch11;

import java.util.Arrays;

public class TestArrays {
  public static void main(String[] args) {
    // Arrays 배열을 다루기 편리한 메서드 (static) 제공
    // toString 배열을 받아 배열 출력
    // Arrays.copyOf(복사할 배열, 몇개 복사할지)
    // Arrays.copyOfRange(복사할 배열, 복사시작점, 복사끝낼곳) // 주의 복사끝낼곳-1 까지만
    // 복사하려는 배열의 길이보다 더 많이 복사하려고 한다면 00으로 채움
    int[] arr = new int[5];
    Arrays.fill(arr, 9);
    System.out.println(Arrays.toString(arr));
    
    // 람다식 입력값 가능
    Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);
    System.out.println(Arrays.toString(arr));
    
    int idx = Arrays.binarySearch(arr, 2);
    System.out.println(idx);
    
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
    //이진 바이너리탐색은 정렬되어있을때만 가능
    idx = Arrays.binarySearch(arr, 2);
    System.out.println(idx);
    
    //다차원 배열의 출력
    //Arrays.deepToString
    
    int[] arrtwo = new int[10];
    System.out.println(Arrays.toString(arrtwo));
    Arrays.setAll(arrtwo, (i) -> (int)(Math.random()*100+1));
    Arrays.sort(arrtwo);
    System.out.println(Arrays.toString(arrtwo));
    System.out.println(Arrays.binarySearch(arrtwo, 2));
    
  }

}
