package task4

fun main(args: Array<String>) {

    // 타입추론과 함수
    var a = 1234
    var b = 1234L

    var c = 12.45
    var d = 12.45f

    var e = 0xABCD
    var f = 0b0101010

    var g = true
    var h = 'c'

    // 함수
    // 함수는 특정한 동작을 하거나
    // 원하는 결과값을 연산하는데 사용
    println(add(5, 6, 7))

    // 단일 표현식 함수
    println(addTwo(5, 6, 7))


}

// 단일 표현식 함수
// 타입추론이 가능하기에 리턴 타입을 명시하지 않아도 된다.
fun addTwo(a: Int, b: Int, c: Int) = a + b + c

// 일반적인 함수
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}