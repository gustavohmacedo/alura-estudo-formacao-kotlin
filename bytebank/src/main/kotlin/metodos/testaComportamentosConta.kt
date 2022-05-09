package metodos

import contas.ContaCorrente
import contas.ContaPoupanca

fun testaComportamentosConta() {
    val contaGustavo = ContaCorrente(titular = "Gustavo Henrique", numero = 1000)
    contaGustavo.deposita(-550.0)
    println("Titular ${contaGustavo.titular}")
    println("Número da conta: ${contaGustavo.numero}")
    println("Saldo R$ ${contaGustavo.saldo}")
    println()

    val contaPeter = ContaPoupanca(titular = "Peter Henrique", numero = 1001)
    contaPeter.deposita(600.0)
    println("Titular: ${contaPeter.titular}")
    println("Número da conta: ${contaPeter.numero}")
    println("Saldo R$ ${contaPeter.saldo}")
    println()



    contaGustavo.deposita(50.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.saca(10.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.transfere(contaPeter, 39.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")
    println("${contaPeter.titular} contém o saldo na conta de R$ ${contaPeter.saldo}")
}