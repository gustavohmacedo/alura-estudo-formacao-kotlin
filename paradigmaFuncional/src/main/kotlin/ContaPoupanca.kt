data class ContaPoupanca(
    val cliente: Cliente,
    val numero: Int,
    var saldo: Double? = 0.0
) {
    fun deposita(valor: Double) {
        this.saldo =+ valor
    }
}
