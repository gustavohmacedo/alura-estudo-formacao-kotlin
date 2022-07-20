package main.br.alura.array.testes

fun testesIdades() {

    val idades: IntArray = intArrayOf(15, 18, 61, 25, 35, 60)

    var maiorIdade: Int = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: $maiorIdade")


    var menorIdade: Int = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }

    }
    println("Mneor idade: $menorIdade")

}