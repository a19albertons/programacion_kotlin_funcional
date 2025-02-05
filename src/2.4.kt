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
//fun ganados(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { it.local == equipo && it.marcadorLocal>it.marcadorVisitante }.count() + lista.filter { it.visitante == equipo && it.marcadorLocal<it.marcadorVisitante }.count()
//}
//fun perdidos(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { it.local == equipo && it.marcadorLocal<it.marcadorVisitante }.count() + lista.filter { it.visitante == equipo && it.marcadorLocal>it.marcadorVisitante }.count()
//}
//fun empates(equipo: String, lista:List<partidos>): Int{
//    return lista.filter { (it.local == equipo ||it.visitante == equipo) && it.marcadorLocal==it.marcadorVisitante }.count()
//}
//
//fun main() {
//    val fichero = File("partidos.txt")
//    val resultados = contenido(fichero)
////    println(resultados)
//    println("***partidos Real Madrid***")
//    resultados.filter { it.local == "Real Madrid" || it.visitante == "Real Madrid" }
//        .sortedWith(compareBy<partidos>({ it.marcadorLocal < it.marcadorVisitante }).thenBy { it.marcadorLocal == it.marcadorVisitante }
//            .thenBy { it.marcadorLocal > it.marcadorVisitante })
//        .forEach { println(it.local + " vs." + it.visitante + " " + it.marcadorLocal + " " + it.marcadorVisitante) }
//    println()
//    println("***Resumen por equipos: partidos ganados,perdidos, empatados y puntuación***")
//    resultados.distinctBy { it.local }.sortedBy { it.local }.forEach{ println(it.local+": "+ganados(it.local,resultados)+","+perdidos(it.local,resultados)+","+empates(it.local,resultados)+","+puntos(it.local,resultados)) }
//}
//
//fun puntos(local: String, resultados: List<partidos>): Int {
//    return ganados(local,resultados)*3+empates(local,resultados)
//}
