package ch05;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Ex5_Arrays {
  public static void main(String[] args) {

    int[][] numbers_arr = new int[5][5];
    int[][] numbers_arr_two = new int[5][5];

    //2차원 배열 출력
    System.out.println(Arrays.deepToString(numbers_arr));
    //2차원 배열이 같은값인지 확인
    System.out.println(Arrays.deepEquals(numbers_arr, numbers_arr_two));

    int[] arr = {0, 1, 2, 3, 4};
    System.out.println(Arrays.toString(arr));

    //배열 처음부터 ~
    int[] arr2 = Arrays.copyOf(arr, 3);
    System.out.println(Arrays.toString(arr2));
    int[] arr3 = Arrays.copyOf(arr, 7);
    System.out.println(Arrays.toString(arr3));

    //배열 설정된 시작부터 ~
    int[] arr4 = Arrays.copyOfRange(arr, 2, 4);
    System.out.println(Arrays.toString(arr4));
    int[] arr5 = Arrays.copyOfRange(arr, 0, 7);
    System.out.println(Arrays.toString(arr5));

    //배열 오름차순 정렬
    int[] temp_arr = {3, 2, 0, 1, 4};
    System.out.println(Arrays.toString(temp_arr));
    Arrays.sort(temp_arr);
    System.out.println(Arrays.toString(temp_arr));

    //배열 내림차순 정렬 (단 프리머티브 타임은 안됨)
    Integer[] INTarr = {3, 2, 0, 1, 4};
    Arrays.sort(INTarr, Collections.reverseOrder());
    System.out.println(Arrays.toString(INTarr));


    //  배열의 합
    System.out.println(IntStream.of(temp_arr).sum());






  }

}
