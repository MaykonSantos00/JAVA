package POO.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public void imprime() {
        if (salario == null) return;
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double i : this.salario) {
            System.out.print(i + " ");
        }
    }

    public void mediaSalario() {
        if (salario == null) return;
        double soma = 0;
        for (double i : this.salario) {
            soma += i;
        }
        soma /= salario.length;
        System.out.println("\n" + soma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
