package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.exception.ValorInvalidoException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Gustavo",
            cpf = "777.777.777-77",
            senha = 1213
        ),
        numero = 1000
    )
    contaCorrente.deposita(139.70)
    println(contaCorrente)
    println()

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Peter",
            cpf = "999.999.999-99",
            senha = 2332
        ),
        numero = 1001
    )
    contaPoupanca.deposita(valor = 600.0)
    println(contaPoupanca)
    println()

    contaCorrente.deposita(valor = 50.0)
    println("${contaCorrente.titular.nome} contém o saldo na conta de R$ ${contaCorrente.saldo}")

    contaCorrente.saca(valor = 10.0)
    println("${contaCorrente.titular.nome} contém o saldo na conta de R$ ${contaCorrente.saldo}")

    try {
        contaCorrente.transfere(contaDestino = contaPoupanca, valor = 139.3, senha = 1213)
        println("${contaCorrente.titular.nome} contém o saldo na conta de R$ ${Math.round(contaCorrente.saldo)}")
        println("${contaPoupanca.titular.nome} contém o saldo na conta de R$ ${Math.round(contaPoupanca.saldo)}")
        println("Transferência realizada com sucesso!")
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na autenticação")
        println("Falha na transfência")
        e.printStackTrace()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    } catch (e: ValorInvalidoException) {
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

}