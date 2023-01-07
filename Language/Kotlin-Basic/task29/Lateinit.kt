package task29

// Lateinit var 변수의 제한사항
// 초기값 할당 전까지
// 번수를 사용할 수 없음(에러발생)

// 기본 자료형에는 사용할 수 없으나 String 클래스는 사용이 가능하다.
fun main(args: Array<String>) {

    val a = LateInitSample()
    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

    // 지연 대리자 속성
    // lazy delegate properties
    // 해당 변수를 사용하느 시점에 초기화가 진행된다.
    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)

}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        // isInitialized 해당 변수의 값이 초기화 되어있는가?
        if(::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }
}


