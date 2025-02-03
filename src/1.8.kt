fun exagerar(s:String) = "eres super " +s

//falta función describir()

fun main() {
    val tu = describir()
    println( tu("guay"))
}

fun describir(): (String) -> String = ::exagerar
 