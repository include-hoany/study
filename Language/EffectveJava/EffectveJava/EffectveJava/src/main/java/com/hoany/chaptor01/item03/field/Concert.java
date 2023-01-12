package com.hoany.chaptor01.item03.field;

// Concert는 Elvis의 클라이언트 코드
public class Concert {

    private boolean lightsOn;
    private boolean mainStateOpen;

    // Elvis는 클라이언트 코드
    private Elvis elvis;

    public Concert(Elvis elvis) {
        this.elvis = elvis;
    }

    public void perform() {
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }
}
