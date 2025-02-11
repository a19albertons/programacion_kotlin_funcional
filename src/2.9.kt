class Articulo(var codigo: String, var pvp: Double)

fun main() {
    val listaArticulos = listOf(
        Articulo("A1", 10.0),
        Articulo("A2", 30.5),
        Articulo("B1", 30.0),
        Articulo("B2", 100.0),
        Articulo("c1", 66.5)
    )
    //calcular total con una secuencia
    val total = listaArticulos.asSequence().map { it }.filter { it.codigo[0] == 'B' }.sumOf { it.pvp }
    println(total)
}