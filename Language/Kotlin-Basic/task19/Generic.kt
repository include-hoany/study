package task19

import java.util.*

fun main(args: Array<String>) {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting(B())

    doShouting<B>(B())

    var temp: Optional<A> =  if(B() is A) Optional.of(B()) else Optional.of(A())
    temp.get().shout()
}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B: A() {
    override fun shout() {
        println("B가 소리칩니다")
   }
}

class C: A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A> (var t: T) {
    fun doShouting() {
        t.shout()
    }
}