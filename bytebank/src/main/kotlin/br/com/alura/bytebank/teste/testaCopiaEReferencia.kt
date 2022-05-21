import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencia() {
    //Atribuição por Cópia
    var x = 10
    var y = x
    y++
    println("X = $x")
    println("Y = $y")

    //Atribuição por Referência
    var contaJoao = ContaPoupanca(
        Cliente(
            nome = "João",
            cpf = "000.000.000-00",
            senha = 1144
        ),
        numero = 1002
    )
    var contaMaria = contaJoao
    println("Conta joão: ${contaJoao.titular}")
    println("Conta maria: ${contaMaria.titular}")
}