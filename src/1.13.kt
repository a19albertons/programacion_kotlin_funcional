private operator fun MyLittleDecimal.plus(sumado2:MyLittleDecimal): MyLittleDecimal {
    val suma = this.valor + sumado2.valor
    return MyLittleDecimal(suma.toString())
}
class MyLittleDecimal(valorEnString: String) {
    var valor: Int = 0

    init {

        this.valor = valorEnString.replace(",", "").toInt()
    }

    fun sumar(otro: MyLittleDecimal): MyLittleDecimal {
        val suma = this.valor + otro.valor
        return MyLittleDecimal(suma.toString())
    }

}

fun main() {
    val sumando1 = MyLittleDecimal("2,12")
    val sumando2 = MyLittleDecimal("0,10")
    val suma1=sumando1.sumar(sumando2)
    println(suma1.valor )
    val suma2=sumando1 + sumando2
    println(suma2.valor)

}