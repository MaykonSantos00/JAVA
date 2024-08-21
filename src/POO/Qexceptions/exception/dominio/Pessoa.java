package POO.Qexceptions.exception.dominio;

import java.io.IOException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando pessoa");
    }

}
