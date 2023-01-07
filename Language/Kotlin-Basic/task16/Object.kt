package task16

fun main(args: Array<String>) {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)

}

// 싱글턴 패턴 약간 Enum과 같은?
object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }

}