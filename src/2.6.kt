import java.io.File

data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){

}
fun contenido(fichero: File): List<partidos>{
    val contenido = fichero.readLines()
    val devolver = mutableListOf<partidos>()
    for (i in contenido) {
        val lista = i.split(",")
        devolver.add(partidos(lista[0],lista[1],lista[2].toInt(),lista[3].toInt()))
    }
    return devolver
}

fun goles_recibidos(equipo: String, lista: List<partidos>): Int {
    return lista.filter { it.local == equipo }.sumOf { it.marcadorVisitante }
}

fun main() {
    val fichero = File("partidos.txt")
    val resultados = contenido(fichero)
//    println(resultados)
    println("*** Para cada equipo, total de goles recibidos cuando jugó en casa ***")
    resultados.distinctBy { it.local }.forEach{ println(it.local+": "+goles_recibidos(it.local,resultados)+" goles recibidos") }

}
