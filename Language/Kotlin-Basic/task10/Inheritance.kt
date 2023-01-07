package task10

import task8.Person

fun main(args: Array<String>) {
    // 상속
    // 상속할 수 있도록 open 해줘야 상속할 수 있다.
    // 코틀린은 기본적으로 상속이 불가능하도록 설정되어 있다.

    var a = Animal("별이", 5, "개")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bark()


    var c = Animal("나비", 5, "고양이")
    var d = Cat("나비", 5)

    c.introduce()
    d.introduce()

    d.meow()
}

open class Animal(var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${this.type} ${this.name}이고, ${this.age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name, age, "개") {

    fun bark() {
        println("멍멍")
    }

}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {

    fun meow() {
        println("야옹")
    }

}