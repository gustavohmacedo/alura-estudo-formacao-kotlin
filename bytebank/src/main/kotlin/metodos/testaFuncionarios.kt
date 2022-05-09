package metodos

import regra_de_negocio.CalculadoraBonificacao
import regra_de_negocio.SistemaInterno
import funcionarios.Analista
import funcionarios.Auxiliar
import funcionarios.Diretor
import funcionarios.Gerente

fun testaFuncionarios() {
    val gustavo = Analista(nome = "Gustavo", cpf = "078.231.561-55", 1600.0, plr = 180.0)
    println("Nome: ${gustavo.nome}")
    println("CPF: ${gustavo.cpf}")
    println("Salário: ${gustavo.salario}")
    println("PLR: ${gustavo.plr}")
    println("Bonificação: ${gustavo.bonificacao()}")
    println()

    val peter = Gerente(nome = "Peter", cpf = "044.222.231-00", salario = 2000.0, senha = 12345, plr = 200.0)
    println("Nome: ${peter.nome}")
    println("CPF: ${peter.cpf}")
    println("Salário: ${peter.salario}")
    println("Bonificação: ${peter.bonificacao()}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(peter, 1234)
    println()

    val sarah = Diretor(nome = "Sarah", cpf = "033.333.333-77", salario = 4000.0, senha = 2468, plr = 400.0)
    println("Nome: ${sarah.nome}")
    println("CPF: ${sarah.cpf}")
    println("Salário: ${sarah.salario}")
    println("Bonificação: ${sarah.bonificacao()}")
    println("PLR: ${sarah.plr}")

    val sistema = SistemaInterno()
    sistema.entrar(sarah, 2468)
    println()

    val maria = Analista(nome = "Maria", cpf = "011.444.888-11", salario = 3000.0, plr = 450.0)
    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao()}")
    println("PLR: ${maria.plr}")
    println()

    val ricardo = Auxiliar(nome = "Riacardo", "011.777.333-88", 1800.0)
    println("Nome: ${ricardo.nome}")
    println("CPF: ${ricardo.cpf}")
    println("Salário: ${ricardo.salario}")
    println("Bonificação: ${ricardo.bonificacao()}")
    println()

    val calculadora = CalculadoraBonificacao();
    calculadora.registra(gustavo)
    calculadora.registra(peter)
    calculadora.registra(sarah)
    calculadora.registra(maria)
    calculadora.registra(ricardo)

    println("Total da bonificação: ${calculadora.total}")
}

