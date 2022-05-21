package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    //Object Expression (Objeto anônimo)
    val guga = object : Autenticavel {
        val nome: String = "Gustavo"
        val senha: Int = 123

        override fun autentica(senha: Int): Boolean {
            if (this.senha == senha) {
                return true
            }
            return false
        }

    }

    val sistema = SistemaInterno()
    sistema.entrar(guga, 123)


    val gustavo = Cliente(nome = "guga", cpf = "", senha = 1)
    val peter = Cliente(nome = "peter", cpf = "", senha = 2)
    val contaCorrente = ContaCorrente(titular = gustavo, numero = 1)
    val contaPoupanca = ContaPoupanca(titular = peter, numero = 2)

    println("total contas criadas: ${Conta.totalContasCriadas}")
}