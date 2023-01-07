package task22

fun main(args: Array<String>) {

    // ?. null safe operator
    // 참조연사자를 실행하기전에 먼저 객체가 null인지
    // 확인하고 null 인경우 실행하지않는다

    // ?; elvis operator
    // 객체가 null이 아니라면 그대로 만약 null 이면 연산자 우측의 값으로 대체

   // !!. non-null assertion operator
   // 참조연산자를 사용할때 null 여부를 컴파일시 확인하지 않게 하여
   // 의도적으로 NullPointException 예외가 발생하다록 방치한다

    var a: String? = null
    println(a?.uppercase())

    println(a?:"default".uppercase())
    //    println(a!!.uppercase())

    a = "Kotlin Exam"

    //  null safe 연산자는 스코프 함수와 사용하면 더욱 활용성이 높아진다.
    a?.run {
        println(uppercase())
        println(lowercase())
    }

    // 변수의 동일성
    // 동일성에는 두가지 개념이 있다
    // 내용의 동일성 객체의 동일성

    // 내용의 동일성은 객체는 다르더라도 값이 같다면 같은것이다.
    // 객체의 동일성은 값은 다르더라도 객체가 같다면 같은것이다.

    var z = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = z
    var d = Product("사이다", 1000)

    println(z == b)
    println(z === b)

    println(z == c)
    println(z === c)

    println(z == d)
    println(z === d)



}

// 자바와 비슷하게 객체의 비교는 equals를 오버라이딩 하여 처리할 수 있다.
class Product(val name: String, val price: Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Product) {
            return other.name == this.name && other.price == this.price
        } else {
            return false
        }
    }

}