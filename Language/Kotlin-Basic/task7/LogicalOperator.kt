package task7

fun main(args: Array<String>) {

   for(i in 1..10) {
       if(i == 3) continue
       println(i)
   }

    loop@for(i in 1..10) {

        for(j in 1..10) {
            if(i == 1 && j == 2) break@loop
            println("i : $i, j : $j")
        }

    }

    // 논리연산자
    println(true && false)
    println(true || false)
    println(!true)
    println(!false)

    var a = 6
    var b = 4

    println(a > 5 && b > 5)

}