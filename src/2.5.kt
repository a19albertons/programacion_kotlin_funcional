//import java.io.File
//
//data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){
//
//}
//
//fun main() {
//    val fichero = File("partidos.txt")
//    val lineas = fichero.readLines()
//    val resultados = lineas.map { lineas -> val (local, visitante, marcadorLocal, marcadorVisitante) = lineas.split(",")
//        partidos (local,visitante, marcadorLocal.toInt(), marcadorVisitante.toInt())}
////    println(resultados)
//    println("***Todos los partidos con más de 3 goles***")
//    resultados.filter { it.marcadorLocal+it.marcadorVisitante > 3 }.forEach { println(it.local+" vs "+it.visitante+": "+it.marcadorLocal+" - "+it.marcadorVisitante) }
//    println()
//    println("***Partidos ordenados por número de  goles (de más a menos)***")
//    resultados.sortedByDescending { it.marcadorLocal+it.marcadorVisitante }.forEach { println(it.local+" vs "+it.visitante+": "+it.marcadorLocal+" - "+it.marcadorVisitante)}
//}
