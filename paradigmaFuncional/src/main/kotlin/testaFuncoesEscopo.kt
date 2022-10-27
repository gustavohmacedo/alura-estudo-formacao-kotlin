import java.util.*

fun testaScopeFunctions() {
    //Higher Oder Functions - Scope Functions
    //let, run e with: retornam um resultado lambda - O resultado da computação
    //aplly e also: retornam o próprio objeto de contexto

    //let
    Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Apt b"
    ).let { it ->
        "${it.logradouro}, ${it.complemento}"
            .uppercase(Locale.getDefault())
    }.let(::println)

    //run - Envia o obj de contexto(receiver - this) e o resultado é uma lambda
    Endereco(
        logradouro = "Rua Doutor Mário de Campos",
        complemento = "Casa 2"
    ).run {
        "${this.logradouro}, ${this.complemento}"
            .uppercase(Locale.getDefault())
    }.let { retornoEmMaiusculo: String ->
        println(retornoEmMaiusculo)
    }

    //with (Não Extension Function)- Envia o obj de contexto(receiver - this) e o resultado é uma lambda
    val endereco = Endereco(logradouro = "Rua Marechal Deodoro", complemento = "Próx. à praça")
    with(endereco) {
        "${this.logradouro}, ${this.complemento}"
            .uppercase(Locale.getDefault())
    }.let(::println)

    //apply - O obj de contexto é disponível como um receiver(this) e o resultado é seu próprio obj
    Endereco().apply {
        this.logradouro = "Rua Ipiranga"
        this.complemento = "Comércio"
    }.let(::println)

    //also [Log] - O obj de contexto é disponível como um argumento(it) e o resultado é seu próprio obj
    val address = Endereco()
        .apply {
            this.logradouro = "Rua Imperatriz"
            this.complemento = "Asa Branca"
        }
        .also { info ->
            println("Criando um Endereço... $info")
        }
        .let(::println)


    listOf(
        Endereco(complemento = "Casa"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    ).filter { it ->
        it.complemento.isNotEmpty()
    }.let(::println)
}
