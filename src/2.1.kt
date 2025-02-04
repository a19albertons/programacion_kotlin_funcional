fun numerosPrimos(numeros: List<Int>): List<Int> {
    fun esPrimo(numero: Int): Boolean {
        if (numero <= 1) {
            return false
        }
        for (i in 2..numero / 2) {

            if (numero % i == 0) {
                return false
            }
        }

        return true
    }
    return numeros.filter { esPrimo(it) }
}

fun main(){
    val numeros = listOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primos = numerosPrimos(numeros)
    println(primos)
}