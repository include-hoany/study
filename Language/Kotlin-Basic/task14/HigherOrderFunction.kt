package task14

// 고차 함수
fun main(args : Array<String>) {
    b(::a)
}

fun a (str: String) {
    println("$str 함수 a")
}

fun b (function: (String)->Unit) {
    function("b가 호출한")
}