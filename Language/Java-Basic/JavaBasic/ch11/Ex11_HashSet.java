package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_HashSet {
  public static void main(String[] args) {
    
    Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
    Set set = new HashSet();
    
    for(int i = 0; i < objArr.length; i++) {
      System.out.println(set.add(objArr[i]));
    }
    
    System.out.println(set);
    
    Iterator it = set.iterator();
    
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    
    
    // Set, HashSet, SortedSet, TreeSet 중복을 허용하지 않음
    // Set은 순서가 없지만 순서를 유지하려면  LinkedHashSet클래스를 사용하면 된다.
    
    //TreeSet 범위 검색과 정렬에 유리한 컬렉션 클래스
    //HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
    
    //HashSet
    
    //생성자
    //HashSet()
    //HashSet(Collection c) // 콜렉션 자손들오 생성 가능
    //HashSet(int initalCapacity) // 초기용량
    //hashSet(int initialCapacity, float loadFactor)
    // 용량을 늘릴때 몇퍼센트가 가득찼을때 두배로 늘릴지 설정이 가능하다
    // loadFactor = 0.8 80%가 찬다면 용량을 두배로 늘린다.
    
    //주요 메서드
    //boolean
    //add(Object o)
    //addAll(Collection c) // 합집합
    //remove(Object o)
    //removeAll(Collection c) // 교집합
    //retainAll(Collection c) // 차집합 조건부 삭제
    
    //void
    //clear()
    
    //boolean
    // contains(Object o) // 객체가 포함되어있는지
    // containsAll(Collection c) // 여러객체 모두 포함 
  }

}
