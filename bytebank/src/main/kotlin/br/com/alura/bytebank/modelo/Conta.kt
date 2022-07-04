package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
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

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha);
    }

    override fun toString(): String {
        return "Titular da conta: $titular, Número da conta: $numero, Saldo: R$ $saldo"
    }

}

