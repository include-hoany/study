package task16

// CompanionObject
fun main(args : Array<String>) {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    a.vote()
    b.vote()
    b.vote()

    println(a.count) // 3
    println(b.count) // 2
    println(FoodPoll.total) // 5

}

class FoodPoll(var name: String) {

    // 기존 언어들의 static  비슷한 형식이지만
    // 참조연산자 형식으로 companion 접근할 수 있으니 그 의미를 생각해보면 좋다.
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }

}