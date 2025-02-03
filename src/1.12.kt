fun main() {
    var mensaje = "Hola"
    val cambiarMensaje: (String) -> String = {
        mensaje = it
        it
    }

    println(cambiarMensaje("Mundo"))
    println(mensaje)
}