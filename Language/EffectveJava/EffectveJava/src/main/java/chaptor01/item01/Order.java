package chaptor01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urggent;

    private Product product;

    // ENUM을 사용하면 특정한 값들로 제한할 수 있다.
    // 타입 세이프티 하다.
    // 만약 int , String과 같은 값으로 상태를 구분한다면
    // 엣지 케이스가 많이 발생할 수 있다.
    // 다라서 Enum을 사용하면 타입 세이프하게 사용할 수 있다.
    // Enum싱글턴 패턴이다.
    private OrderStatus orderStatus;

    // 정적 팩토리 메소드

    // 기본 생성자의 단점
    // 시그니처가 같은 생성자는 중복될수 없다
    // 생성자는 이름이 고정이다 따라서 명시적으로 어떤 객체를 만들지
    // 이름을 명시할 수 없다

//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }

    //정적 팩토리 메소드는 해당 객체를 생성할때 상태 유형에따라
    // 명시적으로 할 수 있다.
    // 또한 파라미터 시그니처가 동일해도 생성자와는 다르게 만들수 있다.

    // prime Order 객체를 명시적으로 생성하는 정적 메소드를 만들 수 있다.
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    // urgentOrder 객체를 명시적으로 생성하는 팩토리 메소드를 만들 수 있다.
    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urggent = true;
        order.product = product;
        return order;
    }

}
