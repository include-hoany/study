package task9

fun main(args: Array<String>) {

 // 클래스 생성자
    var a = PersonTwo("박보영", 1990)
    var b = PersonTwo("전정국", 1997)
    var c = PersonTwo("장원영", 2004)

    var d = PersonTwo("이루다")
    var e = PersonTwo("차은우")
    var f = PersonTwo("류수정")

}

class PersonTwo(var name: String, val birthYear: Int) {

    // 생성자
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    //보조 생성자
    constructor(name: String) : this(name, 1997) {
        println("보조 생성자")
    }

}