package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var totalContasCriadas = 0
            private set
    }

    init {
        println("Criando conta")
        totalContasCriadas++
    }

    abstract fun deposita(valor: Double)
    abstract fun saca(valor: Double)
    override fun toString(): String {
        return "Titular da conta: $titular, Número da conta: $numero, Saldo: R$ $saldo"
    }


}