package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_3 {
  public static void main(String[] args) {
//   String source = "HP:011-1111-1111, HOME:02-999-9999 ";
//   String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
     
   
//   String sourceOne = "111111-1111111";
   String[] names = {"김연아", "아이유", "금나라"};
   String pattern = "아.*";
   
   Pattern p = Pattern.compile(pattern);
   
   for(int i = 0; i < names.length; i++) {
     Matcher m = p.matcher(names[i]);
     System.out.println(m.matches()? names[i] : "틀림");
    }
   
   
//   int i = 0;
//   while(m.find()) {
////     System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
//   }
  }
}
