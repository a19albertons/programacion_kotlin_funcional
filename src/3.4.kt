fun crearYConfigurarPersona(function: Persona.() -> Unit): Persona {
    val persona=Persona("",0,"")
    persona.function()
    return persona
}
class Persona(var nombre: String ,var edad: Int, var direccion: String )
fun main() {

    val persona = crearYConfigurarPersona {
        nombre = "Juan"
        edad = 25
        direccion = "Calle 123"
    }

    // Imprimimos los datos de la persona
    println("Nombre: ${persona.nombre}, Edad: ${persona.edad}, Dirección: ${persona.direccion}")
}