package ch09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TestStringTokenizerEx5 {
  public static void main(String[] args) {
    String data = "100,,,200,300";
    
    String[] result = data.split(",");
    System.out.println(Arrays.toString(result));
    StringTokenizer std = new StringTokenizer(data, ",");
    
    while(std.hasMoreTokens()) {
      System.out.print(std.nextToken() + "|");
    }
    
  }

}
