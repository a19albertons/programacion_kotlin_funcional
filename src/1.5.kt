fun Char.esLetraMinuscula():Boolean{
    if (this == this.uppercaseChar()){
        return false
    }
    else {
        return true
    }
}
fun main(){
    println('a'.esLetraMinuscula())
    println('A'.esLetraMinuscula())
    println('5'.esLetraMinuscula())
}