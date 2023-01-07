package ch13;

import javax.swing.JOptionPane;

public class Ex13_4 {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
    for(int i = 10; i > 0; i--) {
      System.out.println(i);
      try {
        Thread.sleep(1000);
      } catch(Exception e) {
        
      }
    }
  }

}
