package ch09;

public class Ex9_11_String {
  public static void main(String[] args) {
    //문자열을 받는 String  생성자
   String s = new String("Hello");
   System.out.println(s);
   
   // 문자 배열을 받는 String 생성자가 있다
   char[] c = {'H', 'e', 'l' ,'l', 'o'};
   s = new String(c); 
   
   // StringBuffer 을 받는 String 생성자가 있다.
   StringBuffer sb = new StringBuffer("Hello");  
   s = new String(sb);
   
   //문자열 인덱스 접근
   for(char item : s.toCharArray()) {
     System.out.println(item);
   }
   
   //문자열 사전순으로 비교
   int i = "aaa".compareTo("aaa");
   int i2 = "aaa".compareTo("bbb");
   int i3 = "bbb".compareTo("aaa");
   System.out.println(i);
   System.out.println(i2);
   System.out.println(i3);
   
   //문자열 결합
   s = s.concat(" World");
   System.out.println(s);
   
   //지정된 문자열이 포함되어 있는지
   System.out.println(s.contains("World"));
   
   //지정된 문자열로 끝나는지 확인
   s = s.concat(".txt");
   System.out.println(s.endsWith(".txt"));
   
   //지정된 문자열로 시작하는지 확인
   System.out.println(s.startsWith("Hello"));
   
   //문자열이 같은지 비교
   System.out.println(s.equals("Hello World.txt"));
   
   //대소문자와 상관없이 문자가 같은지 비교
   boolean nonUpperLower = "Hello".equalsIgnoreCase("hello");
   System.out.println(nonUpperLower);
   
   //특정 문자가 몇번째 문자열에 있는지 확인
   //찾는 문자열이 없으면 -1
   //뒤를 기준으로 찾고싶다면 lastindexOf
   int index = s.indexOf("W");
   System.out.println(s);
   System.out.println(index);
   
   //문자열 구분자로 문자열 배열로 나누기
   String sarr = "김연아, 아이유, 박서준, 권나라";
   String[] sarrTemp = sarr.split(",");
   for(String item : sarrTemp) {
     //문자열에 특정 부분을 새로운 문자로 변경
     System.out.println(item.replace(" ", ""));
   }
   
   //문자열의 일부를 자른다
   s = "java.lang.Object";
   String tc = s.substring(10);
   String p =s.substring(5, 9);
   
   System.out.println(tc);
   System.out.println(p);
   
   //모두 소문자로 변경
   String st = "HELLO".toLowerCase();
   System.out.println(st);
   
   //모두 대문자로 변경
   st = st.toUpperCase();
   System.out.println(st);
   
   //문자 앞뒤 공백을 제거
   String tt = "  Hello World        ";
   tt = tt.trim();
   System.out.println(tt);
    
  }

}
