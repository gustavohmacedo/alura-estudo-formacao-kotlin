package funcionarios

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    
    override fun bonificacao(): Double = salario * 0.05

}