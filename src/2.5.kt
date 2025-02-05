//import java.io.File
//
//data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){
//
//}
//fun contenido(fichero: File): List<partidos>{
//    val contenido = fichero.readLines()
//    val devolver = mutableListOf<partidos>()
//    for (i in contenido) {
//        val lista = i.split(",")
//        devolver.add(partidos(lista[0],lista[1],lista[2].toInt(),lista[3].toInt()))
//    }
//    return devolver
//}
//
//
//fun main() {
//    val fichero = File("partidos.txt")
//    val resultados = contenido(fichero)
////    println(resultados)
//    println("***Todos los partidos con más de 3 goles***")
//    resultados.filter { it.marcadorLocal+it.marcadorVisitante > 3 }.forEach { println(it.local+" vs "+it.visitante+": "+it.marcadorLocal+" - "+it.marcadorVisitante) }
//    println()
//    println("***Partidos ordenados por número de  goles (de más a menos)***")
//    resultados.sortedByDescending { it.marcadorLocal+it.marcadorVisitante }.forEach { println(it.local+" vs "+it.visitante+": "+it.marcadorLocal+" - "+it.marcadorVisitante)}
//}
