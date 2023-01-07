package task27

// CollectionFunction
fun main(args: Array<String>) {

 val nameList = listOf("박수영", "김지수", "감디현", "신유나", "김지우")
 nameList.forEach { print(it + " ") }

 println()
 println(nameList.filter { it.startsWith("김") })

 println(nameList.map{ "이름 : " + it})

 println(nameList.any { it == "김지연"} )
 println(nameList.all { it.length == 3 })
 println(nameList.none { it.startsWith("이")})

println(nameList.first { it.startsWith("김")})
println(nameList.last { it.startsWith("김")})
println(nameList.count { it.contains("지")})

}

// forEach()

// map

// filter

// Reduce

// collection.any {it == 0 } 하나라도 조건에 맞으면 true

// collection.all { it == 0 } 모두 조건에 맞으면 true

// collection.none { it == 0 } 하나도 조건에 맞지 않으면 true

// collection.first() 일반 함수인 경우는 첫번째 값

// collection.first { it > 3 } 람다식의 경우조건에 맞는 첫번쨍 값을 반환

// collection.last 일반 함수인 경우는 마지막값

// collection.last { it > 3 } 람다식의 경우 조건에 맞는 마지막 값을 반환

// first -> find 대체 가능 마찬가지로 last -> findLast 대체 가능

// find, last를 사용할때 만약 컬렉션이 비어있거나 찾는 값이없는경우 예외 발생
// NoSuchElementException 예외가 발생할 수 있다..
// 이것을 방지하기 위해 firstOrNull, LastOrNull 을 사용하여 만약 비어있거나
// 찾는값이 없는경우 null을 반환하여 처리가 가능하다.

// collection.count 일반함수의 경우 컬렉션의 갯수

// collection.count { it > 7 } 람다식의 경우 조건에 맞는 값의 갯수
