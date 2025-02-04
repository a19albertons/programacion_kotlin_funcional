data class Articulo(val id: Int, val nombre: String, val precio: Double, val cantidad: Int)
val listaArticulos= listOf(
    Articulo(1, "Coca Cola", 8.0, 10),
    Articulo(2, "Pepsi", 8.0, 10),
    Articulo(3, "Fanta", 7.0, 10),
    Articulo(4, "Sprite", 6.0, 20),
    Articulo(5, "Manzanita", 5.0, 25),
    Articulo(6, "7up", 6.0, 30),
    Articulo(7, "Mirinda", 10.0, 25),

    )

fun main() {
    listaArticulos.filter { it.cantidad < 26 }.sortedWith(compareBy<Articulo>
    { it.cantidad }.thenBy { it.precio }.thenBy { it.nombre }).forEach { println(it) }
}