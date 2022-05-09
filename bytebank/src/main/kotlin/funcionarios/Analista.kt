package funcionarios

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double = (salario * 0.15) + plr


}