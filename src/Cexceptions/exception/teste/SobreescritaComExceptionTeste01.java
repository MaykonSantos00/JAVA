package Cexceptions.exception.teste;

import Cexceptions.exception.dominio.Funcionario;
import Cexceptions.exception.dominio.LoginInvalidoException;
import Cexceptions.exception.dominio.Pessoa;

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
