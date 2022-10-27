fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 1500
        cep = "04336-020"
        complemento = "Apto"
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        enderecoCompleto()
    }.let { endCompleto: String ->
        println(endCompleto)
    }
}