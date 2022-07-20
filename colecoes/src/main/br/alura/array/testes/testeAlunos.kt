package main.br.alura.array.testes

fun testeAlunos() {
    val idadesAlunos: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    println(idadesAlunos.contentToString())

    val tamanhoArray = idadesAlunos.size
    println("Tamanho do Array: $tamanhoArray")

    val maiorIdade = idadesAlunos.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idadesAlunos.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades: Double = idadesAlunos.average()
    println("Média das idades: $mediaIdades")

    val todosMaiores = idadesAlunos.all { it >= 18 }
    println("Todos são mariores de idade? $todosMaiores")

    val existeMaior = idadesAlunos.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val apenasTodosMaiores = idadesAlunos.filter { it >= 18 }
    println("Maiores: $apenasTodosMaiores")

    val buscaPrimeiroMaior = idadesAlunos.find { it >= 18 }
    println("Primeiro maior do Array: $buscaPrimeiroMaior")
}