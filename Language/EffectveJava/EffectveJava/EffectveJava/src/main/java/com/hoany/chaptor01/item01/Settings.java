package com.hoany.chaptor01.item01;

// 기본 생성자를 만들면 매번 새로운 인스턴스가 만들어진다.
//  Settings settings = new Settings();

import java.util.ArrayList;
import java.util.List;

//하지만 경우에 따라 하나의 객체만 제한하도록 통제할 필요성이 있을 수 있다.

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private static final Settings SETTINGS = new Settings();

    // 기본 생성자를 제한할 수 있다.
    // 정적 팩토리 메소드의 단점
    // private 생성자를 제한하면 상속이 불가능 하다
    // 자바독에서의 구분이 힘들다 왜냐하면 정적 팩토리 메소드는 그저 메소드이기때문에.
    // 생성자로 구분되지 않는다.

    // 자바독에서 따로 정적 팩토리 메소드는 생성자로 구분하지 않기때문에
    // 이펙티브 자바에서는 정적 팩토리 메소드명을 규칙정으로 사용해 구분하는걸
    // 추천한다. 예시로 of, create, newInstance, getInstance 등과 같은 명명 규칙을 따르면 좋다.
    private Settings() {}

    // 기본 생성자를 제한하고 있기 때문에 Settings의 객체는 정적 팩토리 메소드로만
    // 접근할 수 있다. 다만 현재 정적 필드에 생성된 객체만을 리턴하기 때문에
    // 단일 객체만 전달받게 되고 싱글턴으로 관리된다.
    // 객체 생성을 자기 자긴이 컨트롤 할 수 있게 된다.

    // 이펙티브 자바에서 플라이웨이트 패턴이 언급되는데
    // 그 이유는 플라이웨이 패턴은 자주 사용하는 객체를
    // 미리 로드를 해놓고 필요할때 이미 로드된 객체를 가져다
    // 쓰게 된다. 따라서 기본 생성자를 제한하고 정적 팩토리
    // 메소드로 단일 객체를 전달받는 부분이 플라이웨이 패턴과
    // 유사하기에 명시되어 있다.
    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List.of("kssesun", "whiteship");
    }

}
