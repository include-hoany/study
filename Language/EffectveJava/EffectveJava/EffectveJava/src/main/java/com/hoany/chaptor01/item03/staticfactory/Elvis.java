package com.hoany.chaptor01.item03.staticfactory;

// 코드 3-2 정적 팩터리 방식의 싱글턴
public class Elvis implements  Singer{
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    // 클라이언트 코드가 변경되지 않으면서 원하는대로 동작을 변경할 수 있다.
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());

    }

    @Override
    public void sign() {
        System.out.println("my way~~~~~~~");
    }
}

