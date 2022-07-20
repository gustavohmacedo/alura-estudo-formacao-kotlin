package main.br.alura.array.testes

fun testeRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s, ")
    }
    println()

    val numerosPares = 0..60 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar, ")
    }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 1499.99
    if (salario in intervalo) {
        println("Salário está no intervalo")
    } else {
        println("Salário não está no intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    print(letra in alfabeto)
}
