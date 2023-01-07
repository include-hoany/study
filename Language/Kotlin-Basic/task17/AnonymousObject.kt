package task17

// 익명
fun main(args: Array<String>) {
    AEventPrinter().start()
}

interface AEventListener {
    fun onEvent(count: Int)
}

class ACounter(var listener: AEventListener) {

    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class AEventPrinter {
    fun start() {
        // AEventListener 을 상속한 익명 함수를 넘긴다다
       var counter = ACounter(object: AEventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}