package contas

import interfaces.TransferenciaConta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), TransferenciaConta {
    override fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositanto R$ $valor na conta de ${this.titular}")
        } else {
            println("Valor do depósito inserido é inválido.")
        }
    }

    override fun saca(valor: Double) {
        val TAXA_SAQUE = 0.10

        if (valor > 0 && (valor + TAXA_SAQUE) <= this.saldo) {
            this.saldo -= (valor + TAXA_SAQUE)
            println("Sacando R$ $valor da conta de ${this.titular}")
            println("Foi cobrada uma taxa de saque no valor de R$ $TAXA_SAQUE")
        } else {
            println("Sr. ${this.titular}, o valor do seu saque de R$ $valor foi negado.")
            throw Exception("Valor do saque inserido é inválido para esta operação.")

        }
    }

    override fun transfere(contaDestino: Conta, valor: Double) {
        this.saca(valor)
        contaDestino.deposita(valor)
        println("${this.titular} transferiu R$ $valor para ${contaDestino.titular}")
        println("Transferência realizada com sucesso!")
    }

}