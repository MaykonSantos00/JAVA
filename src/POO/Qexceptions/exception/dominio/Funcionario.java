package POO.Qexceptions.exception.dominio;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() {
        System.out.println("Funcionario salvo com sucesso!");
    }
}
