package task24

// 중첩 클래스
// NestedClass
// 중첩 클래스는 하나의 클래스가 다른 크래스의 기능과
// 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식으로

fun main(args: Array<String>) {

    var temp = Outer.NestedClass()
    var tempt = Outer()

    // inner 클래스는 단독으로 객체 생성이 불가능 하다
    // var tempf = Outer.Inner() 에러

    // 외부 클래스가 있어야 생성 가능
    var tempfive = Outer().Inner()

    // 중첩 클래스는 외부 클래스의 생성과 상관없이 생성 동작이 가능
    Outer.NestedClass().inrtoduce()

    var outer = Outer()
    var inner = outer.Inner()

    inner.inrtoduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()

}

class Outer {
    var text = "Outer Class"

    class NestedClass {
        // 외부 클래스의 내용을 공유할 수 없음.
        fun inrtoduce() {
            println("Nested Class")
        }

    }

    // inner class는 외부 클래스의 객체가 있어야만
    // 생성과 사용이 가능한 클래스 이다.
    inner class Inner {
        var text = "Inner Class"

        fun inrtoduceInner() {
            println(text)
        }

        fun introduceOuter() {
            // 외부 클래스의 속성과 함수의 사용이 가능
            println(this@Outer.text)
        }
    }

}