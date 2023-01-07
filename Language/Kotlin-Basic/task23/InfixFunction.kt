package task23


fun main(args:Array<String>) {


    println(6 multiply 4)
    println(6.multiply(4))

}

// 코틀린에는 마치 연산자처럼 사용할 수 있는 함수를 정의할 수 있다.
// infix function 함수
infix fun Int.multiply(x: Int): Int = this * x



