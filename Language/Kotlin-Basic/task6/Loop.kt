package task6

fun main(args: Array<String>) {

   // 반복문
    // while

    // 증감연산자

    var a = 0

    while(a < 5) {
        println(a++)

    }

    // 감소연산자

    var b = 5

    while(b > 0) {
        println(b--)

    }

    // do while

    a = 0

    do {

        println(a++)

    } while (a < 5)

    // for
    // 0 부터 9
    // 증감
    for(i in 0..9) {
        print(i)
    }

    println()

    for(i in 0..9 step 3) {
        print(i)
    }

    println()

    // 감소
    for(i in 9 downTo 0) {
        print(i)
    }

    println()

    for(i in 'a'..'e') {
        print(i)
    }

}