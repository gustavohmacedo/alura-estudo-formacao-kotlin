package metodos

import contas.ContaCorrente
import contas.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Henrique", numero = 1000)
    contaCorrente.deposita(1000.0)
    println("Saldo C/C: ${contaCorrente.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo após saque - C/C: ${contaCorrente.saldo}")
    println()

    val contaPoupanca = ContaPoupanca(titular = "Joelma", numero = 1001)
    contaPoupanca.deposita(1000.0)
    println("Saldo C/P: ${contaPoupanca.saldo}")
    contaPoupanca.saca(100.0)
    println("Saldo após saque - C/P: ${contaPoupanca.saldo}")
}