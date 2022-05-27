package br.com.alura.bytebank.exemplos_testes

fun main() {
    val nome = "Gustavo"
    val sobrenome = "Henrique"

    testaClasseString(nome)
    println("**********************************")
    testaClasseString(sobrenome)
    println("==================================")

    testaSubstring(nome)
    println("**********************************")
    testaSubstring(sobrenome)

}

fun testaClasseString(palavra: String) {
    for (caractere in palavra) {
        println(caractere)
    }

}

fun testaSubstring(texto: String) {
    println(texto.substring(3, 5))

}



