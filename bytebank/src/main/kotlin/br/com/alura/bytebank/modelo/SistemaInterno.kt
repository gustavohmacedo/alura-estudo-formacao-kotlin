package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank!")
        } else {
            println("Falha na autenticação")

        }

    }

}