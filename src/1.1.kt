fun sumar(vararg v: Int): Int{
    return  v.sum()
}
fun main(){
    println(sumar(1, 2, 3, 4, 5))
    println(sumar(5, 2))
    println(sumar(1,1,1,1,1,1,1,1))
    println(sumar(1))
    val miArray= intArrayOf(9)
    println(sumar(*miArray))
    //println(sumar(miArray))//error espera una lista de Ints y le mandamos IntArray sin avisar con *
}