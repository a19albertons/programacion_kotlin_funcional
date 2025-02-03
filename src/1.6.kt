private operator fun String.unaryMinus(): String {
    return this.reversed()
}

data class Puntito(val x: Int, val y: Int) {
    operator fun unaryMinus(): Puntito = Puntito(-this.x,-this.y)
}
fun main() {
    val Puntito = Puntito(10, 20)
    println(-Puntito)
    println(-"12345Hola mundo")
}