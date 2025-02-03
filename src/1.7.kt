tailrec fun multiplicar(numero: Int, veces: Int, acc: Int = 0): Int {
    return if (veces>0) {
        multiplicar(numero,veces-1, acc+numero)
    }
    else {
        return acc
    }
}
fun main(){
    println(multiplicar(100000,2))
    println(multiplicar(2,100000))
}