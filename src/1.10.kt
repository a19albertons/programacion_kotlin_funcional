fun main() {
    val multiplicacion: /* completa el tipo aquí */(Int, Int) -> Int = { a, b -> a * b }
    val concatenar: /* completa el tipo aquí */ (String, String) -> String = { str1, str2 -> str1 + str2 }
    val esMayor: /* completa el tipo aquí */ (Int, Int) -> Boolean = { edad1, edad2 -> edad1 > edad2 }

    println(multiplicacion(3, 4))  //
    println(concatenar("Hola", " Mundo"))
    println(esMayor(25, 18))
    println(esMayor(16, 21))
}