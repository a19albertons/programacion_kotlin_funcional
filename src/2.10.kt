import java.io.File
// funciones de consulta
val fichero=File("2001.txt")
val leer=fichero.readLines()
fun consulta1() {
    leer.map { it }.filter { it.length>0 }.last().let { println(it) }
}
fun consulta2() {
    leer.map { it }.filter { it.contains("HAL") && it.length < 40 }.forEach{
        println(it)
    }
}
fun consulta3() {
    leer.map {it}.filter { it.contains("Dave Bowman:") }.forEach { println(it.replace("HAL","IBM"))}.toString()
}

fun main() {
    consulta1()//imprimir la última línea con texto
    println("-----------")
    consulta2()//imprimir todas las líneas  en las que habla HAL  y son menores  40 caracteres
    println("-----------")
    consulta3() //imprimir todas las frases de Dave sustituyendo en el texto HAL por IBM
}