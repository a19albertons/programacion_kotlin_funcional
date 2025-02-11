data class moda (val numero: Int, val veces: Int)
fun main(){


    generateSequence {
        val num_numeros= readln().toInt()
        if (num_numeros == 0) {
            null
        }
        else {
            num_numeros
        }
    }.forEach {
        val lista_moda = mutableListOf<moda>()
        val lista_numero= readln().split(" ").map { it.toInt() }
        lista_numero.distinct().forEach { distinguido ->
            val veces = lista_numero.filter { it == distinguido }.count()
            lista_moda.add(moda(distinguido, veces))
        }
        lista_moda.filter { it.veces == lista_moda.maxOf { it.veces } }.forEach{
            println(it.numero)
        }
    }


}