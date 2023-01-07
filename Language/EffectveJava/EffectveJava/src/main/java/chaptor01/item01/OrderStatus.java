package chaptor01.item01;

import lombok.Getter;

@Getter
public enum OrderStatus {

    PREPARING("주문접수완료"),
    SHIPPED("배송준비중"),
    DELIVERING("배송중"),
    DELIVERED("배송완료");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

}
