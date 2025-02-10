//import java.io.File
//
//data class partidos(val local:String, val visitante:String, val marcadorLocal: Int, val marcadorVisitante: Int){
//
//}
//fun ganados(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { it.local == equipo && it.marcadorLocal>it.marcadorVisitante }.count() + lista.filter { it.visitante == equipo && it.marcadorLocal<it.marcadorVisitante }.count()
//}
//fun perdidos(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { it.local == equipo && it.marcadorLocal<it.marcadorVisitante }.count() + lista.filter { it.visitante == equipo && it.marcadorLocal>it.marcadorVisitante }.count()
//}
//fun empates(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { (it.local == equipo ||it.visitante == equipo) && it.marcadorLocal==it.marcadorVisitante }.count()
//}
//fun puntos(local: String, resultados: List<partidos>): Int {
//    return ganados(local,resultados)*3+empates(local,resultados)
//}
//
//fun main() {
//    val fichero = File("partidos.txt")
//    val lineas = fichero.readLines()
//    val resultados = lineas.map { lineas -> val (local, visitante, marcadorLocal, marcadorVisitante) = lineas.split(",")
//        partidos (local,visitante, marcadorLocal.toInt(), marcadorVisitante.toInt())}
////    println(resultados)
//    println("***partidos Real Madrid***")
//    resultados.filter { it.local == "Real Madrid" || it.visitante == "Real Madrid" }
//        .sortedByDescending { it.local }
//        .forEach { println(it.local + " vs." + it.visitante + " " + it.marcadorLocal + " " + it.marcadorVisitante) }
//    println()
//    println("***Resumen por equipos: partidos ganados,perdidos, empatados y puntuación***")
//    resultados.distinctBy { it.local }.sortedBy { it.local }.forEach{ println(it.local+": "+ganados(it.local,resultados)+","+perdidos(it.local,resultados)+","+empates(it.local,resultados)+","+puntos(it.local,resultados)) }
//}
//
//
