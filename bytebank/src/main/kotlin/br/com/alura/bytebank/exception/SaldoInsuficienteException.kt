package br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "Saldo insuficiente para esta operação"
) : Exception(mensagem)


