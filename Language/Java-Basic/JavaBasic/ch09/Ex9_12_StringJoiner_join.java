package ch09;

public class Ex9_12_StringJoiner_join {
  public static void main(String[] args) {
    //여러 문자열 사이에 구분자를 넣어서 결합한다. 
    String animals = "dog,cat,bear";
    String[] arr = animals.split(",");
    String str = String.join("-", arr);
    System.out.println(str);
    
    //프리미티브 타임 에서 문자열로변경
    //단 레퍼런스 타입은 toString()의 결과값으로 나옴
    Integer i = Integer.valueOf("100");
    System.out.println(i.getClass().getSimpleName());
  }

}
