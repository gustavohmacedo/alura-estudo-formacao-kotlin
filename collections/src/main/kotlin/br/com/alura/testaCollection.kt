package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = listaDeDados.toList()

    fun salva(nome: String) {
        listaDeDados.add(nome)
    }

    companion object {
        val listaDeDados: MutableList<String> = mutableListOf()
    }

}

private fun testaColecao() {
    val nomes: Collection<String> = listOf(
        "Guga",
        "jÓ",
        "Biel",
        "Zé",
        "Jão"
    )

    for (nome in nomes) {
        println(nome)
    }

    println("Tem Guga na lista? ${nomes.contains("Guga")}")
    println("Tamanho da lista: ${nomes.size}")
}