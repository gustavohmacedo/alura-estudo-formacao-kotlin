package contas

abstract class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

    abstract fun deposita(valor: Double)
    abstract fun saca(valor: Double)
//    abstract fun transfere(contaDestino: contas.Conta, valor: Double)

}