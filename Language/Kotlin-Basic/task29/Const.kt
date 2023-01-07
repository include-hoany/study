package task29

// 변수의 활용

// var 은 할당된 값을 언제라도 변경이 가능하다.
// val 은 처음 초기화 되면 그 이후부터는 값의 변경이 불가능 하다.
// 하지만 val 은 객체의 주소만 변경을 못하는 것이지 객체에 속한
// 필드는 수정이 가능하다는것을 잊지 않아야 한다.

// 다만 객체의 속성또한 변경이 불가능한 방법이 있는데 그것은 상수이다.
// 상수는 기본 자료형만 지정이 가능하다.
// 상수는 클래스 변수, 지역변수로는 사용이 불가능 하다.
// companion object 에서만 사용이 가능하다
// 상수의 네이밍은 CONST_A를 사용한다

fun main(args: Array<String>) {

    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)

}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}입니다.")

    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}

