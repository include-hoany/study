package ch12;

import java.util.ArrayList;

public class TestWildCard {
  public static void main(String[] args) {
    ArrayList<? extends Product> list = new ArrayList<Tv>();
    ArrayList<? extends Product> listTwo = new ArrayList<Audio>();
//  ArrayList<Product> listTree = new ArrayList<Tv>(); // 타입 불일치로 에러
    
    // <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
    // <? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
    // <?> 제한 없음 모든 타입이 가능 <? extends Object> 와 동일
    
  }

}
