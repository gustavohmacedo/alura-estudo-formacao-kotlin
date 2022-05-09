import contas.ContaPoupanca

fun testaCopiaEReferencia() {
    //Atribuição por Cópia
    var x = 10
    var y = x
    y++
    println("X = $x")
    println("Y = $y")

    //Atribuição por Referência
    var contaJoao = ContaPoupanca("Guga", 1002)
    var contaMaria = contaJoao
    println("contas.Conta jão: ${contaJoao.titular}")
    println("contas.Conta maria: ${contaMaria.titular}")
}