package br.com.alura.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : br.com.alura.bytebank.modelo.Funcionario(nome, cpf, salario) {
    
    override fun bonificacao(): Double = salario * 0.05

}