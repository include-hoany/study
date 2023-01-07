package task30

import java.time.LocalDateTime

// 비트 연산자
// 비트를 밀어주는 bitwise shift operators
// 단 부호비트를 제외한 비트를 쉬프트 한다
// 좌측 shl 우측 shr
// 부호비트를 포함한 우측이동 ushr
fun main(args: Array<String>) {

    var bitDate: Int = 0b10000
    bitDate = bitDate or(1 shl 2)
    println(bitDate.toString(2))

    var result = bitDate and(1 shl 4)
    println(result.toString(2))
    println(result shr 4)

    // inv 는 보든 비트를 반전 1 -> 0, 0 -> 1
    bitDate = bitDate and((1 shl 4).inv())
    println(bitDate.toString(2))

    println((bitDate xor(0b10100)).toString(2))

    var data = LocalDateTime.now()
    println(data)

    var bdata = 0b0001 shl 3
    println(bdata.toString(2))

}