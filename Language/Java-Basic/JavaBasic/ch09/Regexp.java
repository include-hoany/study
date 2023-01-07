package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
  public static void main(String[] args) {
    String source = "A broken hand works, but not a broken heart.";
    String pattern = "broken";
    StringBuffer sb = new StringBuffer();
    
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(source);
    
    int i = 0;
    while(m.find()) {
      System.out.println(++i + ": " + m.start() + "~" + m.end());
      m.appendReplacement(sb, "drunken");
    }
    m.appendTail(sb);
    
    System.out.println("Replacement count : " + i);
    System.out.println(sb);
  }

}
