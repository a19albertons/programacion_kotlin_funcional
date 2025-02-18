//data class Persona(val nombre: String, val edad: Int){
//
//}
//fun pares(original: List<Int>): List<Int> {
//    return original.filter { it % 2 == 0}
//}
//fun suma(list: List<Int>): Int{
//    return list.sum()
//}
//fun avg(list: List<Int>): Double {
//    return list.average()
//}
//fun max(list: List<Int>): Int {
//    return list.max()
//}
//fun noVocalInicio(list: List<String>): Int {
//    var contador = 0
//    for (j in list){
//        var i= j.lowercase()
//        if (i[0] == 'a' || i[0] == 'e' || i[0] == 'i' || i[0] == 'o' || i[0] == 'u'){
//            contador++
//        }
//    }
//    return list.size-contador
//}
//fun main() {
//    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println("Consultas sobre esta lista de numeros: $numeros")
//    println("Suma de los elementos pares: " + suma(pares(numeros)))
//    println("Media de los elementos pares: " + avg(pares(numeros)))
//    println("Máximo  de los elementos pares: " + max(pares(numeros)))
//    val personas = listOf(
//        Persona(nombre = "Juan", edad = 25),
//        Persona(nombre = "Pedro", edad = 30),
//        Persona(nombre = "Maria", edad = 20),
//        Persona(nombre = "Ana", edad = 35),
//        Persona(nombre = "Luis", edad = 40)
//    )
//    println("Consultas sobre esta lista de personas: $personas")
//    println("Edad promedio: " + personas.map { it.edad }.average())
//    println("Edad más pequeña: " + personas.map { it.edad }.min())
//    println("Cantidad de nombres que no empiezan por vocal: "+noVocalInicio(personas.map { it.nombre }))
//}
