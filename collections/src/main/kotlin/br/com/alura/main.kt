package br.com.alura

fun main() {

    val pedidos: List<Pedido> = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)

    )
    println(pedidos)

    //associateBy:basta indicar apenas a associação
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    //Agrupando nomes pela letra inicial
    val nomes: List<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])


}

data class Pedido(val numero: Int, val valor: Double)




