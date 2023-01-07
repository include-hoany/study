package task3

fun main(args: Array<String>) {

    // 코틀린은 명시적 형변환만 지원하는 언어이다
    // 다른 언어에서 지원하는 암시적 형변환은 지원하지 않는다.

    //    형변환 함수
    //    toByte
    //    toShot
    //    toInt
    //    toLong
    //    toFloat
    //    toDouble
    //    toChar

    var a: Int = 54321

    var b: Long = a.toLong()

    //    배열
    //  선언시 초기화
    // 선언시 사이즈가 고정되는 한계가 있지만
    // 다른 자료구조보다 속도가 빠르다.
    var intArr = arrayOf(1, 2, 3, 4, 5)

    // 비어있는 배열
    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8
    println(nullArr[4])


}