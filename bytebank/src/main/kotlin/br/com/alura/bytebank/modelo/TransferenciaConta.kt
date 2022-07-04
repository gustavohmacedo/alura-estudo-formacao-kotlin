package br.com.alura.bytebank.modelo

interface TransferenciaConta {
    fun transfere(contaDestino: Conta, valor: Double, senha: Int)
}