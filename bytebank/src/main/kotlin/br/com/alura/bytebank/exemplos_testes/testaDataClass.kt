package br.com.alura.bytebank.exemplos_testes

fun main() {

    val gustavo = Pessoa(
        nome = "Gustavo",
        idade = 34
    )
    println(gustavo)
    gustavo.fala()

    val documento1 = Documento(
        rg = "66333444-X",
        cpf = "123.456.555-98"
    )
    println("Documento 1: $documento1")

    //Método copy
    val documento2 = documento1.copy()
    println("Documento 2 utilizando o método copy() : $documento2")


    //Data Classes e Destructuring Declarations
    val (rg: String, cpf: String) = documento1
    println("Rg: $rg, CPF: $cpf")

}

class Pessoa(val nome: String, val idade: Int) {
    fun fala() {
        println("Emite som")
    }
}

//Data Class
data class Documento(val rg: String, val cpf: String)