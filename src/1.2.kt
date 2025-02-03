fun <T> concatenar(valor:List<T>): String{
    var devolver = StringBuilder()
    for (i in valor){
        devolver.append(i.toString())
    }
    return devolver.toString()
}
fun main(){
    val listaEnteros = listOf(1, 2, 3, 4, 5)
    val resultadoEnteros = concatenar(listaEnteros)
    println(resultadoEnteros)
    val listaCadenas = listOf("Hola", "Mundo", "!")
    val resultadoCadenas = concatenar(listaCadenas)
    println(resultadoCadenas)
}