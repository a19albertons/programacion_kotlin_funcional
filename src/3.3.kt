//
//
//class Persona(var nombre: String, var edad: Int)
//
//fun main() {
//    val personas: List<Persona?> = listOf(
//        Persona("yo", 34),
//        null,
//        Persona("tu", 23),
//        Persona("el", 98)
//    )
//
//    val descripciones = mutableListOf<String?>()
//
//    personas.forEach { persona ->
//        val descripcion = persona?.run {
//            val edadAparente = edad - 5
//            "La persona $nombre tiene $edadAparente años"
//        }
//        descripciones.add(descripcion)
//    }
//
//    println(descripciones)
//}
