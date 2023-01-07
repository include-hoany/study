package task23


fun main(args:Array<String>) {

    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    deliveryItem("선물", destination = "친구집")


}


// 파라미터를 받아야 하는 함수이지만
// 별다른 파라미터가 없더라도 기본값으로
// 동작해야하는 함수를 만들어야 한다면
// default arguments 를 사용하면 된다

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")

}

// 만약 이름과 목적지만 적고 갯수의 값은 디포트값을 사용하고 싶다면?
// named arguments  를 사용한다
// name arguments 파라미터 순서와 상관없이 파라미터의 이름을 지정해서
// 사용하면 된다.
//deliveryItem("선물", destination = "친구집")



