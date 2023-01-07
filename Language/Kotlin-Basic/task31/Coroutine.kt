package task31

// 코루틴은 메인루틴과 별도로 진행이가능한 것
// 코루틴은 제어범위 및 실행범위를 지정할 수 있다. 이를 코루틴의 스코프라 한다.
// GlobalScope 프로그램 어디서나 제어, 동작이 가능한 기본 범위
// CoroutineScope 특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위

// CoroutineScope를 만들 때 적용가능한 Dispatcher

// Dispatchers.Default 기본적인 백그라운드 동작

// Dispatchers.IO I/O에 최적화 된 동작

// Dispatchers.Main 메인 스레드에서 동작

// 디스패처들은 모든 플랫폼에서 지원되지는 않는다
// 지원되는 플랫폼에 따라서 사용해야 한다.

// launch 반환값이 없는 Job 객체

// async 반환값이 있는 Deffered 객체

import kotlinx.coroutines.*

fun main(args: Array<String>) {

    val scope = GlobalScope

    // runBlocking 코루틴이 종료될때까지 메인은 잠시 대기한다
    runBlocking {
        val a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료료"
        }

        println("async 대기")
        println(b.await())

        println("launch 대기")
        a.join()
        println("launch 종료")

        // delay(milisecond:Long) 밀리세컨드 단위로 루틴을 잠시 대기시키는 함수
        // Job.join Job의 실행이 끝날때까지 대기하는 함수
        // Deferred.await() Defferred의 실행이 끝날때까지 대기하는 함수

        //await() 는 Deferred의 결과도 반환함

        // 코루틴은 제어되는 스코프 또는 프로그램 전체가 종료되면
        // 함께 종료되기 때문에 코루틴이 끝까지 실행되는 것을 보장하려면
        // 일정한 범위에서 코루틴이 모두 실행될 때까지 잠시 기다려주어야 한다.

        //    scope.launch {
        //        for(i in 1..5) {
        //            println(i)
        //        }
        //    }

        // 코루틴 실행도중에 중단하는 방법도 있다
        // 코루틴에 cancel() 걸어주면 다음 두 가지 조건이 발생하며 코루틴을 중단시킬 수 있다

        // 1. 코루틴 내부의 delay() 함수 또는 yield() 함수가 사용된 위치까지 수행된 뒤 종료됨
        // 2. cancel() 로 인해 속성인 isActive 가 false 가 되므로 이를 확인하여 수동으로 종료함

        val c = launch {
            for(i in 1..5) {
                println(i)
                delay(10)
            }
        }

        println("async 대기")

        c.cancel()
        println("async 종료")

        c.join()
        println("async 종료")

    }


    // 제한시간 내에 수행되면 결과값을 아니면 null값을 반환하는 코루틴
    runBlocking {
        var result = withTimeoutOrNull(200) {
            for(i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }

}