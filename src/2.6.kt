import java.io.File

data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){

}

fun main() {
    val fichero = File("partidos.txt")
    val lineas = fichero.readLines()
    val resultados = lineas.map { lineas -> val (local, visitante, marcadorLocal, marcadorVisitante) = lineas.split(",")
        partidos (local,visitante, marcadorLocal.toInt(), marcadorVisitante.toInt())}
//    println(resultados)
    println("*** Para cada equipo, total de goles recibidos cuando jugó en casa ***")
    resultados.groupBy { it.local }.forEach{
        println(it.key + ": " + it.value.sumOf { it.marcadorVisitante } + " goles recibidos")
    }

}
