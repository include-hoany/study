package task2

fun main(args: Array<String>) {

    println("테스트")

    // 변수
    // 코틀린은 일반적인 자료형에서는 초기값 또는 null을 허용하지 않는다
    var a: Int = 123
    println(a)

    var at: Int? = null
    println(at)

    //상수
    val b: Int = 123
    println(b)

    //지료형
    //Long
    var intValue: Int = 1234
    var longValue: Long = 1234L
    var intValueByHex = 0x1af
    var intValueByBin = 0b10110110

    //Double
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10

    //Float
    var floatValue = 123.5f

    //Char
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'

    //String
    var stringValue: String = "abcdefg"
    var koreanStringValue: String = "안녕하세요"
    var multiLineStringValue = """안녕하세요
    코틀린을 배우니 재미있네요 
    호호호
    """

    //Boolean
    var booLeanValue: Boolean = true

}