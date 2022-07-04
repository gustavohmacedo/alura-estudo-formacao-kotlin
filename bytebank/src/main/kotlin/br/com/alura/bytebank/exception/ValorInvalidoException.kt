package br.com.alura.bytebank.exception

class ValorInvalidoException(
    mensagem: String = "Valor inserido é inválido para esta operação"
) : Exception(mensagem) {
}