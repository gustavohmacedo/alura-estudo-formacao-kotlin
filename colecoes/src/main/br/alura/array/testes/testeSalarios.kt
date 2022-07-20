package main.br.alura.array.testes

fun testesSalarios() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento: Double = 1.1

    println("Resolução com ForEach - iterando pelos índices")

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    println("Resolução com ForEachIndexed - iterando pelos índices e salário")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
    println(salarios.contentToString())

}