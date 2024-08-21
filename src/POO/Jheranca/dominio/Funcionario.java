package POO.Jheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2 ");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro  do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void imprime2() {
        System.out.println("Meu nome é " + this.nome + " e recebo " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
