import java.io.File

data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){

}


fun goles_recibidos(equipo: String, lista: List<partidos>): Int {
    return lista.filter { it.local == equipo }.sumOf { it.marcadorVisitante }
}

fun main() {
    val fichero = File("partidos.txt")
    val lineas = fichero.readLines()
    val resultados = lineas.map { lineas -> val (local, visitante, marcadorLocal, marcadorVisitante) = lineas.split(",")
        partidos (local,visitante, marcadorLocal.toInt(), marcadorVisitante.toInt())}
//    println(resultados)
    println("*** Para cada equipo, total de goles recibidos cuando jugó en casa ***")
    resultados.distinctBy { it.local }.forEach{ println(it.local+": "+goles_recibidos(it.local,resultados)+" goles recibidos") }

}
