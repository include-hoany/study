package task15

fun main(args: Array<String>) {

    var price = 5000

    // apply 는 인스턴스를 생성한 후 변수에 담기 전에 초기화 과정을 수행할때 많이 사용함
    var a = Book("코틀린의 정석", 10000).apply {
        this.name = "[초특가]" + name
        this.discount()
    }

    // run 스코프 안에서 참조연산자를 사용하지 않아도 된다는 점은 apply 와 같지만
    // 일반 람다함수처럼 인스턴스대신 마지막 구문의 값을 반환한다
    a.run { println("상품명: ${this.name}, 가격: ${this.price}원")  }
    var c = a.run { this.price }

    // with run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 파라미터로 받는다는 차이만 있다

    // apply / also 처리가 끝나면 인스턴스를 반환

    // run / let 처리가 끝나면 최종갑을 반환환
    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }

    println(c)
    println(a)


}


class Book(var name: String, var price: Int) {

    fun discount() {
        this.price -= 2000
    }

    override fun toString(): String {
        return "Book(${this.name}, ${this.price})"
    }

}

