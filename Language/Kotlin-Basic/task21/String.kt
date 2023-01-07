package task21

// 문자열 활용
fun main(args: Array<String>) {
    val test1 = "Test.Kotlin.String"

    println(test1.length)

    // 소문자
    println(test1.lowercase())

    //대 문자
     println(test1.uppercase())

    val testStringArr = test1.split(".")
    println(testStringArr)

    // 문자열 배열 한 문자열로 합치기
    println(testStringArr.joinToString())

    // 구분자로 문자열을 합친다.
    println(testStringArr.joinToString("-"))

    // 문자열 자르기
    println(test1.substring(5..10))

    // 문자열이 비어있는지 확인
    val nullString:String? = null
    val emptyString = ""
    val blankString = " "
    val nomalString = "A"

    // null이거나 비어있다면 true
    println(nullString.isNullOrEmpty()) // true
    println(emptyString.isNullOrEmpty()) // ture
    println(blankString.isNullOrEmpty()) // false
    println(nomalString.isNullOrEmpty()) // false

    println()

    println(nullString.isNullOrBlank()) // true
    println(emptyString.isNullOrBlank()) // true
    println(blankString.isNullOrBlank()) // true
    println(nomalString.isNullOrBlank()) // false

    println()

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    // 해당 문자열로 시작하는지
    println(test3.startsWith("java"))
    println(test3.startsWith("java"))

    // 해당 문자열로 끝나는지
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    // 해당문자열이 포함되어있는지
    println(test3.contains("lin"))
    println(test4.contains("lin"))




}