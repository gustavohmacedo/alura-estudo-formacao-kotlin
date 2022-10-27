fun testaRun() {
    val taxaAnual: Double = 0.5
    val taxaMensal = taxaAnual / 12

    val contaPoupanca =
        ContaPoupanca(cliente = Cliente(nome = "Gustavo", cpf = "111.111.111-00", senha = 1234), numero = 1000)
    contaPoupanca
        .run {
            this.deposita(1000.0)
            this.saldo!! * taxaMensal
        }.let { rendimentoMensal ->
            println("Rendimento Mensal: $rendimentoMensal")
        }

    run {
        var saldo: Double = contaPoupanca.saldo!!
        repeat(12) {
            saldo += (saldo * taxaMensal)
        }
        saldo
    }.let {
        println("Rendimento Anual: $it")
    }
}