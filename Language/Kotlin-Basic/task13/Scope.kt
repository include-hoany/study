package task13

var a = "외부 변수"

class B {
    var a = "클래스 변수"

    fun print() {
        println(a)
    }
}

fun main(args: Array<String>) {
    var a = "함수 변수"
    println(a)
    B().print()

}