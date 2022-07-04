package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.exception.ValorInvalidoException

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositanto R$ $valor na conta de ${this.titular.nome}")
        } else {
            throw ValorInvalidoException("Valor é igual ou menor do que zero: R$ $valor")
        }
    }

    override fun saca(valor: Double) {
        val TAXA_SAQUE = 0.50

        if (valor > 0) {
            if ((valor + TAXA_SAQUE) <= this.saldo) {
                this.saldo -= (valor + TAXA_SAQUE)
                println("Sacando R$ $valor da conta de ${this.titular.nome}")
                println("Foi cobrada uma taxa de saque no valor de R$ $TAXA_SAQUE")
            } else {
                throw SaldoInsuficienteException("O valor informado foi: R$ $valor")
            }
        } else {
            throw ValorInvalidoException("Valor é igual ou menor do que zero: R$ $valor")
        }
    }


}