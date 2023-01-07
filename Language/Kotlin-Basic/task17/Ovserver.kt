package task17

// 옵저버 패턴을 구현하기 위해서는 2가지의 클래스가 필요하다.
// 이벤트를 수신, 이벤트이 발생 및 전달을 하는 클래스다
fun main(args: Array<String>) {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener) {

    fun count() {
        for(i in 1..100) {
            if(i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter(this)
        counter.count()
    }

}