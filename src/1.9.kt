fun esParFunNormal(numero: Int): Boolean{
    return if (numero%2!=0){
        false
    }
    else{
        true
    }
}  //completa la fun

fun main() {
    val esParConFunNormal= esParFunNormal(3)
    println(esParConFunNormal)
    val esParConAnonima = fun(numero: Int): Boolean {
        return if (numero%2!=0){
            false
        }
        else{
            true
        }
    }//version anónima
    println(esParConAnonima(7))
    val esParConLambda= {numero: Int -> numero%2 == 0 }// version lambda
    println(esParConLambda(8))
}