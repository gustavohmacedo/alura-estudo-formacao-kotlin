package main.br.alura.array.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5560.12", "10900.00")
    println("[ Salários ]")
    println(salarios.contentToString())
    println()

    println("[ Salários com aumento ]")
    val aumento = "1.1".toBigDecimal()
    val salarioComAumento: Array<BigDecimal>? = salarios
        ?.map { salalario -> calculaAumentoRelativo(salalario, aumento) }
        ?.toTypedArray()

    println(salarioComAumento.contentToString())
    println()

    val gastoInicialAposAumento = salarioComAumento?.somatoria()
    println("Gasto total após aumento: R$ $gastoInicialAposAumento")
    println()

    val meses = 6.toBigDecimal()
    val gastoTotal = salarioComAumento?.fold(gastoInicialAposAumento) { acumulador, salario ->
        acumulador?.plus((salario * meses).setScale(2, RoundingMode.UP))
    }
    println("Gasto total nos próximos 6 meses: R$ $gastoTotal")
    println()

    val mediaDosSalarios = salarioComAumento
        ?.sorted()
        ?.takeLast(3)
        ?.toTypedArray()?.media()
    println("Média dos três maiores salários: $mediaDosSalarios")

}

private fun calculaAumentoRelativo(salalario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salalario < "5000".toBigDecimal()) {
        salalario + "500".toBigDecimal()
    } else {
        (salalario * aumento).setScale(2, RoundingMode.UP)
    }
}


