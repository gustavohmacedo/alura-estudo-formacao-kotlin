package funcionarios

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha) {

    override fun bonificacao(): Double = (salario * 0.2) + plr


}