data class Endereco(
    var logradouro: String = "",
    var numero: Int? = null,
    var cep: String = "",
    var complemento: String = "",
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
) {

    fun enderecoCompleto(): String {
        return """
            $logradouro - $numero, $cidade - $estado
            $cep
            $complemento
            """.trimIndent()
    }
}