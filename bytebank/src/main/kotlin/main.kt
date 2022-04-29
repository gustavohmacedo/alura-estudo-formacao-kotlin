fun main() {
    val contaGustavo = Conta(titular = "Gustavo Henrique", numero = 1000)
    contaGustavo.deposita(-550.0)
    println("Titular ${contaGustavo.titular}")
    println("Número da conta: ${contaGustavo.numero}")
    println("Saldo R$ ${contaGustavo.saldo}")
    println()

    val contaPeter = Conta(titular = "Peter Henrique", numero = 1001)
    contaPeter.deposita(600.0)
    println("Titular: ${contaPeter.titular}")
    println("Número da conta: ${contaPeter.numero}")
    println("Saldo R$ ${contaPeter.saldo}")
    println()

    contaGustavo.deposita(50.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.saca(15.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")

    contaGustavo.transfere(contaPeter, 25.0)
    println("${contaGustavo.titular} contém o saldo na conta de R$ ${contaGustavo.saldo}")
    println("${contaPeter.titular} contém o saldo na conta de R$ ${contaPeter.saldo}")
}

class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositanto R$ $valor na conta de ${this.titular}")
        } else {
            println("Valor do depósito inserido é inválido.")
        }
    }

    @Throws(Exception::class)
    fun saca(valor: Double) {
        if (this.saldo < valor) {
            println("Sr. ${this.titular}, o valor do seu saque de R$ $valor foi negado")
            throw Exception("Saldo insuficiente para esta operação.")
        } else {
            this.saldo -= valor
            println("Sacando R$ $valor da conta de ${this.titular}")
        }

    }

    fun transfere(contaDestino: Conta, valor: Double) {
        this.saca(valor)
        contaDestino.deposita(valor)
        println("${this.titular} transferiu R$ $valor para ${contaDestino.titular}")
        println("Transferência realizada com sucesso!")

    }

}