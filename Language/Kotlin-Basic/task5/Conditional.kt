package task5

fun main(args: Array<String>) {

   // 조건문 비교연산자

    // if

    var a: Int = 7

    if(a > 10) println("a는 10보다 크다")
    else println("a는 10보다 작거나 같다")

    // doWhen 다른 언어의 Switch문법과 유사하다
    doWhen(1)
    doWhen(1L)
    doWhen(3.14)
    doWhen("Kotlin")

    resultDoWhen(1)
    resultDoWhen(1L)
    resultDoWhen(3.14)
    resultDoWhen("Kotlin")

}

fun doWhen(a: Any) {
    when(a) {
        1 -> println("정수 1입니다.")
        "DiMo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("자료형은 Long 입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 맞지 않았습니다.")
    }
}

fun resultDoWhen(a: Any) {
    var result = when(a) {
        1 -> "정수입니다."
        "DiMo" -> "디모의 코틀린 강좌입니다."
        is Long -> "자료형은 LONG 입니다."
        !is String -> "String  자료형 타입이 아닙니다."
        else -> "어떠한 조건식도 맞지 않았습니다."
    }

    println(result)
}