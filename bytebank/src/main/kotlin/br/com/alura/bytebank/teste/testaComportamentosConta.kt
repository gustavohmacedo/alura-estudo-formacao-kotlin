package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaGustavo = ContaCorrente(
        titular = Cliente(
            nome = "Gustavo",
            cpf = "777.777.777-77",
            senha = 1213
        ),
        numero = 1000
    )
    contaGustavo.deposita(-550.0)
    println(contaGustavo)
    println()

    val contaPeter = ContaPoupanca(
        titular = Cliente(
            nome = "Peter",
            cpf = "999.999.999-99",
            senha = 2332
        ),
        numero = 1001
    )
    contaPeter.deposita(600.0)
    println(contaPeter)
    println()

    contaGustavo.deposita(50.0)
    println("${contaGustavo.titular.nome} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.saca(10.0)
    println("${contaGustavo.titular.nome} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.transfere(contaPeter, 39.0)
    println("${contaGustavo.titular.nome} contém o saldo na conta de R$ ${contaGustavo.saldo}")
    println("${contaPeter.titular.nome} contém o saldo na conta de R$ ${contaPeter.saldo}")
}