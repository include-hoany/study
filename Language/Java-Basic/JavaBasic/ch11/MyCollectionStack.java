package ch11;

import java.awt.Frame;
import java.util.Iterator;
import java.util.Stack;

public class MyCollectionStack extends Frame {
  
  MyCollectionStack() {
    super("프레임테스트");
    setSize(300,300);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    MyCollectionStack f = new MyCollectionStack();
    

    
    Stack mys = new Stack();
    
    mys.push(1);
    mys.push(2);
    mys.push(3);
    mys.push(4);
    mys.push(5);
    mys.push(6);
    mys.push(7);
    
    Iterator i = mys.iterator();
    
    while(i.hasNext()) {
      System.out.println(mys.pop());
    }
    
  }

}
