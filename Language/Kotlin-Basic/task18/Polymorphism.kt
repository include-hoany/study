package task18

// 다형성
fun main(args: Array<String>) {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if(b is Cola) {
        // 조건문 안에서만 잠시 다운캐스팅 된다.
        b.washDishes()
    }

    // as를 사용하면 반환값 뿐만 아니라 변수자체도 다운캐스팅 된다.
    var c = b as Cola
    c.washDishes()
    b.washDishes()

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다.")
    }

}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}