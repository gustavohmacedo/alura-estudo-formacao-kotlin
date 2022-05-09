package regra_de_negocio

import interfaces.Autenticavel

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank!")
        } else {
            println("Falha na autenticação")

        }

    }

}