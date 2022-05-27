fun main() {

    val x: Int = 15
    val y: Double = 14.5
    var z = x
    z += 10

    testaClasseNumber(x)
    testaClasseNumber(y)
    testaClasseNumber(z)
}

// Os tipos primitivos herdam da classe Number
fun testaClasseNumber(valor: Number) {
    println(valor)
}

