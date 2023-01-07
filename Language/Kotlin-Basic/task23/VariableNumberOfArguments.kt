package task23


fun main(args:Array<String>) {


    sum(1, 2, 3, 4, 5, 6, 7,)

}

// 같은 자료형을 갯수와 상관없이 파라미터로 받고싶을때
// variable number of arguments
// vargrg는 개수가 지정되지 않는 파라미터라는 특징이 있으므라
// 항상 순서는 마지막에 지정한다.
// ex sample(text: String, vararg x: Int)

fun sum(vararg number: Int) {
    var sum = 0
     for(n in number) sum += n
    println(sum)
}



