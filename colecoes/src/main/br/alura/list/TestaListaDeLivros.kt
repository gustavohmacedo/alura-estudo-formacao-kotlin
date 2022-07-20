package main.br.alura.list

fun main() {
    listaDeLivros.imprimeComMarcadores()

    val ordenadoPorAnoDePublicacao: List<Livro> = listaDeLivros.sorted()
    ordenadoPorAnoDePublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("Mr.") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println("Ordenando livros por Título, onde nome do autor inicia com 'Mr.' \n$titulos")


}