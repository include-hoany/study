package task23


fun main(args:Array<String>) {

    read(7)
    read("안녕하세요")

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    deliveryItem("선물", destination = "친구집")

    sum(1, 2, 3, 4, 5, 6, 7,)

    println(6 multiply 4)
    println(6.multiply(4))

}


//  오버로딩은 함수의 이름은 같지만 파라미터의 구조가 다른 함수를 정의하는것을
//  의미한다
fun read(x: Int) {
    println("숫자 $x 입니다")
}

fun read(x: String) {
    println(x)
}


