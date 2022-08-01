package br.com.alura


fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

    val valorPedido = pedidos.getValue(5)
    println(valorPedido)

    val menssagem = pedidos.getOrElse(7) {
        "Não tem o pedido"
    }
    println(menssagem)

    println(pedidos.getOrDefault(8, -1.0))

    println(pedidos.keys)
    for (numero in pedidos.keys) {
        println("Pedido: $numero")
    }

    println(pedidos.values)
    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("Pedidos Filtrados")
    println(pedidosFiltrados)
    println()

    val pedidosAcima = pedidos.filterValues { valorPedido ->
        valorPedido > 70.0
    }
    println("Pedidos Acima")
    println(pedidosAcima)
    println()

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Pedidos Pares")
    println(pedidosPares)
    println()

    //Comportamentos de escrita

    println(pedidos + Pair(7, 15.0))
    println(pedidos + mapOf(7 to 10.0))
    println(pedidos + (7 to 18.0))

    println(pedidos - listOf(5, 6))

    pedidos.putAll(setOf(7 to 99.0, 8 to 21.0))
    println(pedidos)

    pedidos += setOf(7 to 99.0, 8 to 21.0)
    println(pedidos)

    //Remoção por chaves
    pedidos.keys.remove(1)
    println(pedidos)

    //Remoção por valores: remove o primeiro elemento da lista
    pedidos.values.remove(100.0)
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)

    println("Teste rápido")
    val pedido: Double? = pedidos[3]
    pedido?.let {
        println("Pedido: $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número: ${p.key} - Valor: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)


}
