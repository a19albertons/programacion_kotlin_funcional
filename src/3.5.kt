class Tarea(var titulo: String, var completada: Boolean = false)

fun main() {
    val listaTareas = mutableListOf(
        Tarea("Ir al cine", completada = true),
        Tarea("Pagar deuda a mi novia", completada = false)
    )
    actualizarListaTareas(listaTareas) {
        add(Tarea("Dormir 10 horas seguidas", completada = true))
        add(Tarea("Hacer la compra", completada = false))
        add(Tarea("Lavar los platos", completada = false))
        add(Tarea("Ir al gimnasio", completada = false))
        add(Tarea("Vaciar la nevera de cervezas ...", completada = true))
        //borrar las tareas que contenga deuda
        removeIf { it.titulo.contains("deuda") }

        sortByDescending { it.completada }
    }

    actualizarListaTareas(listaTareas) {
        add(Tarea("Pedir dinero prestado a mi suegro", completada = false))
        sortByDescending { it.completada }
    }

    println("Lista de tareas:")
    listaTareas.forEach { tarea ->
        println("- ${if (tarea.completada) "[X]" else "[ ]"} ${tarea.titulo}")
    }
}
fun actualizarListaTareas(listaTareas: MutableList<Tarea>, function: MutableList<Tarea>.() -> Unit) {
    listaTareas.function()
}