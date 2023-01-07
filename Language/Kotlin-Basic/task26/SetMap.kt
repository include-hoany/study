package task26

// Set Map
fun main(args: Array<String>) {

    // Set<T> mutableSet<T>
    val a = mutableSetOf("귤", "바나나", "키위")

    for(item in a) {
        println(item)
    }

    a.add("자몽")
    println(a)

    a.remove("바나나")
    println(a)

    println(a.contains("귤"))

    // Map<T> mutableMap<T>
    var m = mutableMapOf("레드벨벳" to  "음파음파",
                        "트와이스" to "FANCY",
                        "ITZY" to "ICY")

    for(entry in m) {
        println(entry.key + " : " + entry.value)
    }

    m.put("오마이걸", "번지")
    println(m)

    m.remove("ITZY")
    println(m)

    println(m["레드벨벳"])


}