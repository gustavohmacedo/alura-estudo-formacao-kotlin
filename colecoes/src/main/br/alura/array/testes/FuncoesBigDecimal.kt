package main.br.alura.array.testes

import java.math.BigDecimal

// variável vararg: indica que a função pode receber N parâmetros
// Dentro da função o parâmetro é disponível como um array de objetos
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>? {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//extension function
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}