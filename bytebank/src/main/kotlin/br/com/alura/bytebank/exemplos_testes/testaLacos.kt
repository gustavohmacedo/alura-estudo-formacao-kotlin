fun testaLacos() {

    println("For loop")
    for (i in 1..5) {
        println(i)
    }
    println()
    println("For loop - downTo")
    for (i in 5 downTo 1) {
        println(i)
    }
    println()
    println("While Loop")
    val items = listOf("Banana", "Manga", "Limão")
    var index = 0
    while (index < items.size) {
        println("Indice na posicão $index é: ${items[index]}")
        index++;
    }
    println()
}