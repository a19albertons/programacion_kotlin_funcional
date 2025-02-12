fun main(){


    generateSequence(::readln)
        .map { it.toInt() }
        .takeWhile { it!=0 }
        .forEach {
            val lista_numero= readln().split(" ").map { it.toInt() }
            val procesado=lista_numero.groupBy { it }.maxBy { it.value.size }
            println(procesado.key)
        }


}