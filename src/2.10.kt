import java.io.File
// funciones de consulta
fun consulta1() {
    val fichero=File("2001.txt")
    val leer=fichero.bufferedReader()
    val ultimaLinea = leer.lineSequence().filter { it.isNotBlank() }.last()
    println(ultimaLinea)
    leer.close()

}
fun consulta2() {
    val fichero=File("2001.txt")
    val leer=fichero.bufferedReader()
    leer.lineSequence().
    filter { it.contains("HAL") && it.length < 40 }.
    forEach{ println(it) }
    leer.close()
}
fun consulta3() {
    val fichero=File("2001.txt")
    val leer=fichero.bufferedReader()
    leer.lineSequence().
    filter { it.startsWith("Dave") }.
    forEach { println(it.replace("HAL","IBM"))}
    leer.close()
}

fun main() {
    consulta1()//imprimir la última línea con texto
    println("-----------")
    consulta2()//imprimir todas las líneas  en las que habla HAL  y son menores  40 caracteres
    println("-----------")
    consulta3() //imprimir todas las frases de Dave sustituyendo en el texto HAL por IBM
}