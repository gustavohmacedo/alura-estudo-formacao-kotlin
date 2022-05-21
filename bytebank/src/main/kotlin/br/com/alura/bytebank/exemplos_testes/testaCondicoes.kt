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
        saldo > 0.0 -> println("contas.Conta é positiva")
        saldo == 0.0 -> println("contas.Conta é neutra")
        else -> println("contas.Conta é negativa")

    }
    println()
}