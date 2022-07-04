package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Sarah",
            cpf = "444.444.444-44",
            endereco = Endereco(
                logradouro = "Rua Alinça",
                numero = 25,
                bairro = "Casa Amarela",
                cidade = "Recife",
                estado = "Pernambuco",
                cep = "52.191-095",
                complemento = "Vila Boa Vista"
            ),
            senha = 1111
        ),
        numero = 1000
    )

    println("Nome Titular: ${contaCorrente.titular.nome}")
    println("CPF Titular: ${contaCorrente.titular.cpf}")
    println("logradouro: ${contaCorrente.titular.endereco.logradouro}")
    println("Número: ${contaCorrente.titular.endereco.numero}")
    println("Bairro: ${contaCorrente.titular.endereco.bairro}")
    println("Cidade: ${contaCorrente.titular.endereco.cidade}")
    println("Estado: ${contaCorrente.titular.endereco.estado}")
    println("CEP: ${contaCorrente.titular.endereco.cep}")
    println("Complemento: ${contaCorrente.titular.endereco.complemento}")
    println()

    contaCorrente.deposita(1000.0)
    println("Saldo C/C: ${contaCorrente.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo após saque - C/C: ${contaCorrente.saldo}")
    println()

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Joelma",
            cpf = "555.555.555-55",
            senha = 2222
        ),
        numero = 1001
    )
    contaPoupanca.deposita(1000.0)
    println("Saldo C/P: ${contaPoupanca.saldo}")
    contaPoupanca.saca(100.0)
    println("Saldo após saque - C/P: ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaDestino = contaPoupanca, valor = 1500.0, senha = 1111)

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Joelma Leite",
            cpf = "123.456.789-10",
            senha = 2222
        ),
        numero = 253512
    )

    contaSalario.deposita(valor = -15.0)
    println("Saldo C/S: ${contaSalario.saldo}")

}