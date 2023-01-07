package ch12;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product { }
class Audio extends Product { }


public class Ex12_1 {
  public static void main(String[] args) {
    ArrayList<Product> productList = new ArrayList<Product>();
    ArrayList<Tv>      tvList = new ArrayList<Tv>();
    // ArrayList<Product> tvList = new ArrayList<Tv>();
     List<Tv> tvListTemp = new ArrayList<Tv>();
    
    productList.add(new Tv()); // 자손타입은 들어갈 수 있다! 다형성!
    productList.add(new Audio()); // 자손타입은 들어갈 수 있다! 다형성!
    
    tvList.add(new Tv()); 
    tvList.add(new Tv());
//    tvList.add(new Audio()); // 자손객체만 가능 컴파일 에러
    
    printAll(productList);
//    printAll(tvList);
 
  }
  
  // 매개변수로 ArrayList<product> 타입변수는 상속관계와 상관없이 동일해야 한다.
  public static void printAll(ArrayList<Product> list) {
    for(Product p : list) 
      System.out.println(p);
  }

}
