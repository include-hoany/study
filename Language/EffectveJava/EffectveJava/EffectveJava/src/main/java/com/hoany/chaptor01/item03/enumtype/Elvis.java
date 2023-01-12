package com.hoany.chaptor01.item03.enumtype;

// 열거 타입 방식의 싱글턴 - 바람직한 방법
// 이넘을 사용하면 역질렬화, 직렬화, 리플렉션 등 다양한 문제를 해결할 수 있다.
// private 생성자가 바이트코드에 enum에 존재하지만 리플렉션 코드에서 제약사항으로 막혀있다.
public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려 자기야, 지금 나갈께!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
