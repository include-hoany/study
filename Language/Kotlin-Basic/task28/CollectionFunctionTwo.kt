package task28

// CollectionFunctionTwo
fun main(args: Array<String>) {
 val personList = listOf(
     Person("유나", 1992),
     Person("조이", 1996),
     Person("츄", 1999),
     Person("유나", 2003)
     )

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)

    val numbers = listOf(-3, 7, 2, -10, 1)
    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")
    println(names zip numbers)

}

data class Person(val name: String, val birthYear: Int)

// associateBy 아이템에서 key를 추출하여 map 으로 변환하는 함수

// group by key 가 같은 아이템 끼리 배열로 묶어 map 으로 만드는 함수

// partition 아이템에 조건을 걸어 두개의 컬렉션으로 나누어

// Pair 아래 first, second로 나눠준다

// collection.flatMap 컬렉션을 1차 평평한 컬렉션으로 만들어 준다.

// collection.getOrElse() 인덱스 위치에 아이템이 있으면 아이템을 반환하고
// 아닌 경우 지정한 기본값을 반환하는 함수 이다.

// listof(1, 2, 3, 4, 5)
// ex collection.getOrElse(5) { 50 } == 50
// 0, 1, 2, 3, 4 까지 있는데 5인덱스는 존제하지 않는다 그래서 50이 반환됨

// collectionA zip collectionB 컬렉션 두 개의 아이템을
// 1:1로 매칭하여 새 컬렉션을 만들어 준다.
// 길이가 작은 컬렉션을 기준으로 매칭한다


