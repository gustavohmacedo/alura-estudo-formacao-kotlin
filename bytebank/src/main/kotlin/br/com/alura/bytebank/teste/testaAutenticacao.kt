import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Guga",
        cpf = "111.222.333-44",
        salario = 2600.0,
        senha = 12345,
        plr = 250.0
    )
    val sistema1 = SistemaInterno()
    sistema1.entrar(gerente, 12345)

    val diretor = Diretor(
        nome = "Gui",
        cpf = "000.222.444-88",
        salario = 3200.0,
        senha = 8899,
        plr = 130.0
    )

    val sistema2 = SistemaInterno()
    sistema2.entrar(diretor, 8800)

    val cliente = Cliente(
        nome = "Ricardo",
        cpf = "555.555.555-55",
        senha = 7747
    )

    val sistema3 = SistemaInterno()
    sistema3.entrar(cliente, 7747)
}