fun main(){


    val secuenciaDeLineas = generateSequence {
        var lineaImpar= readln()//tamaño
        if (lineaImpar!="0") readln() else null
    }
    val secuenciaDeListas=secuenciaDeLineas.map { it.split(" ").map { it.toInt() } }
    secuenciaDeListas.forEach {
        val mapa=it.groupBy { it }
        val entradaModa=mapa.maxByOrNull { it.value.size }
        println(entradaModa?.key)
    }
}