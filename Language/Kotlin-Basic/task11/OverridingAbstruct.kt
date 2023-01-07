package task11


fun main(args: Array<String>) {

//    var t = Tiger()
//    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

}

open class AnimalTwo {
    open fun eat() {
        println("음식을 먹습니다.")
    }

}

class Tiger : AnimalTwo() {
    override fun eat() {
        println("고기를 먹습니다.")
    }

}

// 추상 클래스
abstract class AnimalThree {

    abstract fun eat()

    fun sniff() {
        println("킁킁")
    }

}

class Rabbit : AnimalThree() {

    override fun eat() {
        println("당근을 먹습니다.")

    }

}