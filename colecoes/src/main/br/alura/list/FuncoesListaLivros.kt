package main.br.alura.list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " * ${it.titulo} de ${it.autor} - Ano: ${it.anoPublicacao}"
        }
    println("### Lista de Livros ### \n$textoFormatado\n")

}