package POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio3.dominio;
public class FuncionarioHorista extends Funcionario{
    public double horasTrabalhadas;

    public FuncionarioHorista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public FuncionarioHorista(String nome, double salarioBase, double horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Salario Trabalhadas: " + this.horasTrabalhadas*this.salarioBase);
    }
}
