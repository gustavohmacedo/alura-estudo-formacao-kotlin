package br.com.alura.bytebank.modelo

interface TransferenciaConta {
    fun transfere(contaDestino: br.com.alura.bytebank.modelo.Conta, valor: Double)
}