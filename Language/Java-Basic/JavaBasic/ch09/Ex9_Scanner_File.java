package ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex9_Scanner_File {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(new File("ch09/data3.txt"));
      int count = 0;
      int total = 0;
      
      while(sc.hasNextLine()) {
        String line = sc.nextLine();
        int sum = 0;
        System.out.println(line);
        Scanner sc2 = new Scanner(line).useDelimiter(",");
        
        while(sc2.hasNextInt()) {
          sum += sc2.nextInt();          
        }
        count++;
        total += sum;
      }
      
      System.out.println("Line:" + count + " Total: " + total);
      
    } catch (FileNotFoundException e) {
      System.out.println("파일이 존재하지 않습니다.");
    }
    
  }

}
