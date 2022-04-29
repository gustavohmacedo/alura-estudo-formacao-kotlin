fun main() {
    testaCondicoes()
    testaLacos()
    testaCopiaEReferencia()


}

fun testaCondicoes() {

    val titular = "Gustavo"
    val numeroConta = 1000
    var saldo = 100.0
    saldo += 200

    println("Bem vindo ao ByteBank")
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo R$ $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")

    }
    println()
}

fun testaLacos() {

    println("For loop")
    for (i in 1..5) {
        println(i)
    }
    println()
    println("For loop - downTo")
    for (i in 5 downTo 1) {
        println(i)
    }
    println()
    println("While Loop")
    val items = listOf("Banana", "Manga", "Limão")
    var index = 0
    while (index < items.size) {
        println("Indice na posicão $index é: ${items[index]}")
        index++;
    }
    println()
}

fun testaCopiaEReferencia() {

    //Atribuição por Cópia
    var x = 10
    var y = x
    y++
    println("X = $x")
    println("Y = $y")

    //Atribuição por Referência
    var contaJoao = Conta("Guga", 1002)
    var contaMaria = contaJoao
    println("Conta jão: ${contaJoao.titular}")
    println("Conta maria: ${contaMaria.titular}")
}



