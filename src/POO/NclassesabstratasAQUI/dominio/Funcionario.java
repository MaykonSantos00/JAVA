package POO.NclassesabstratasAQUI.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusFuncionario();
    }

    @Override
    public void imprime() {
        System.out.println("Rói");
    }

    public abstract void bonusFuncionario();
}
