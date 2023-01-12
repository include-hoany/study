package com.hoany.chaptor01.item03.staticfactory;

// 코드 3-2 제네릭 싱글톤 팩토리
public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() {}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE;}

    public void say(T t) {
        System.out.println(t);
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I;m outta here!");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        System.out.println(elvis1);
        System.out.println(elvis2);
        System.out.println(elvis1.hashCode());
        System.out.println(elvis2.hashCode());
        System.out.println(elvis1.equals(elvis2));
        // 해쉬코드도 같지만 == 비교는할 수 없다 왜냐하면 타입이 다르면 비교가 불가능
        // System.out.println(elvis1 == elvis2);
    }

}
