package task25

fun main(args: Array<String>) {

    val a = General("보영", 212)
    println(a == General("보영", 212))
    println(a.hashCode())
    println(a)

    val b = Data("루다", 306)

    println(b == Data("루다", 306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("미연"))
    println(b.copy(id = 618))

    val list = listOf(
        Data("보영", 212),
        Data("루다", 306),
        Data("아린", 618)
    )

    // component1
    for((a, b) in list) {
        println("${a}, ${b}")
    }

    // enum
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)


}
// data 클래스는 데이터를 다루는 데에 최적화된 class이다
// 5가지 기능을 내부적으로 자동으로 생성해준다.
// 1. equalse(), 2. hashcode(), 3. toString(), 4. copy(), 5. component1()

class General(val name: String ,val id: Int)
data class Data(val name: String, val id: Int)

// Enumerated Type
// 열거형
enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}

