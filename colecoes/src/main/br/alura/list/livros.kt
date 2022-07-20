package main.br.alura.list

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "English For Brazil",
        autor = "Peter Parker",
        anoPublicacao = 2002
    ),

    null,

    Livro(
        titulo = "Computer Science",
        autor = "David",
        anoPublicacao = 1995
    ),

    Livro(
        titulo = "Software Engineering",
        autor = "Paul",
        anoPublicacao = 2022
    ),

    null,


    )