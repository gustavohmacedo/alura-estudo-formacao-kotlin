//variáveis do tipo função
fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (a: Int, b: Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println("Soma = ${minhaFuncaoAnonima(10, 10)}")

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario <= 1000.0) {
            return salario + 100.0
        }
        return salario + 50.0
    }
    println("Result = ${calculaBonificacaoAnonima(1000.0)}")
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (a: Int, b: Int) -> Int = { a, b ->
        a + b
    }
    println("Soma = ${minhaFuncaoLambda(20, 15)}")

    //label adicionado para múltiplo retorno
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ it ->
        if (it <= 1000.0) {
            return@lambda it + 100.0
        }
        return@lambda it + 50.0
    }
    println("Result = ${calculaBonificacao(1000.0)}")
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println("Soma = ${minhaFuncaoClasse(5, 4)}")
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma2
    println("Soma = ${minhaFuncao(2, 3)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun soma2(a: Int, b: Int) = a + b

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}