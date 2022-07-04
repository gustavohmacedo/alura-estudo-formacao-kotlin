import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Santa Cruz",
        numero = 2000,
        bairro = "Santa Cruz",
        cep = "0362042"
    )
    println(endereco)
    println()

    val enderecoNovo = Endereco(
        logradouro = "Rua Santa Cruz",
        numero = 1000,
        bairro = "Santa Cruz",
        cep = "0362042"
    )

    println(enderecoNovo.toString())
    println()

    println("Endereco e EnderecoNovo são iguais ? " + endereco.equals(enderecoNovo))
    println("Hashcode Endreco: " + endereco.hashCode())
    println("Hashcode EndrecoNovo: " + enderecoNovo.hashCode())
}