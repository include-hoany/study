package task14

// 람다 함수
fun main(args: Array<String>) {

    var c: (String, String) -> Unit = { str: String, strt: String ->
            println(str + strt)
    }

    var d = { str:String, strt: String ->
        println(str+strt)
    }

    c("안녕", "하세요")
    d("안녕", "하세요")

}