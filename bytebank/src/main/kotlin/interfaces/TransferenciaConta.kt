package interfaces

import contas.Conta

interface TransferenciaConta {
    fun transfere(contaDestino: Conta, valor: Double)
}