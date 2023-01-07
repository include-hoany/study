package ch14;

public class Ex14_0 {
  public static void main(String[] args) {
    //    Object obj = (a, b) -> a > b ? a : b;
    //    MyFunction2 f = new MyFunction2() {
    //      @Override
    //      public int max(int a, int b) {
    //        return a > b ? a : b;
    //      }
    //    };

    MyFunction2 f = (a, b) -> a > b ? a : b;

    int value = f.max(3, 5);  // 오브젝트 타입은 MAX를 사용할 수 없기에
    // 함수형 인터페이스를 사용해야 한다.
    System.out.println("value="+value);

  }

}
@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야함
interface MyFunction2 {
  public abstract int max(int a, int b);
}
