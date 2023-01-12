package com.hoany.chaptor01.item03.field;

import java.io.Serializable;

// 코드 3-1 public static final 빌드 방식의 싱글턴
// Interface 기반으로 구현을 하면 MockElvis같은 가짜 목을 만들어서 테스트를 진행할 수 있다.
public class Elvis implements IElvis, Serializable {
    /**
     * 싱글톤 오브젝트
     */
    public static final Elvis INSTANCE = new Elvis();
    // 생성자가 두번째 호출되었을때는 인스턴스생성을 막아라

    // 리플렉션을 통해 싱글턴을 무력화시킬 수 있는 방법을 사전에 컨트롤 할 수 있는 정적 변수를 설정하여
    // 제한한다.
    private static boolean created;

    // 생성자를 private
    private Elvis(){
//        if (created) {
//            throw new UnsupportedOperationException("can't be created by constructor.");
//        }
//        created = true;
    }
    
    public void leaveTheBuilding() {
        System.out.println("I'll have a blue~ Cgristmas without you");
    }

    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성한다
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    // 오버라이드는 아니지만 시리얼라이저블 인터페이스 구현시 싱글턴 패턴을 해지지 않을 수 있도록
    // readResolve 오버라이드처럼 정의하려 막을 수 있다.
    // 따라서 싱글턴을 해치지 않을 수 있다.
    private Object readResolve() {
        return INSTANCE;
    }
}
