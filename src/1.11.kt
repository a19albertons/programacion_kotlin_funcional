fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // 1. Usando la fun standard sumar
    val resultado1 = aplicarOperacion(5, 3, ::suma /*argumento que es una función*/)
    println("Resultado con función estándar: $resultado1")

    // 2. Usando una función anónima
    val resultado2 = aplicarOperacion(5, 3, fun (a: Int, b: Int): Int {
        return a + b
    } /*argumento que es una función*/)
    println("Resultado con función anónima: $resultado2")

    // 3. Usando una lambda
    val resultado3 = aplicarOperacion(5, 3, {a: Int, b: Int -> a + b }  /*argumento que es una función*/)
    println("Resultado con lambda: $resultado3")

    // 4. Usando una lambda con sintaxis especial de último argumento
    val resultado4 = aplicarOperacion(5, 3) {a: Int, b: Int -> a + b } /*argumento que es una función con sintaxis especial lambda último argumento*/
    println("Resultado con lambda sintaxis especial: $resultado4")
}