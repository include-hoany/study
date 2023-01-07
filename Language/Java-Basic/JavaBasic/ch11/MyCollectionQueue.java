package ch11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyCollectionQueue {
  public static void main(String[] args) {
    Queue myq = new LinkedList();
    
    myq.offer(1);
    myq.offer(2);
    myq.offer(3);
    myq.offer(4);
    myq.offer(5);
    myq.offer(6);
    myq.offer(7);
    myq.offer(8);
    
    Iterator i = myq.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    }
    
    while(i.hasNext()) {
      System.out.println(i.next());
    }
  }

}
