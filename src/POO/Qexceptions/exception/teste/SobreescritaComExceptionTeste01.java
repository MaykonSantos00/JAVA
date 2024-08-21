package POO.Qexceptions.exception.teste;

import POO.Qexceptions.exception.dominio.Funcionario;
import POO.Qexceptions.exception.dominio.LoginInvalidoException;
import POO.Qexceptions.exception.dominio.Pessoa;

import java.io.IOException;

public class SobreescritaComExceptionTeste01 {
    public static void main(String[] args) throws RuntimeException {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | IOException e) {
            throw new RuntimeException(e);
        }

        funcionario.salvar();
    }
}
