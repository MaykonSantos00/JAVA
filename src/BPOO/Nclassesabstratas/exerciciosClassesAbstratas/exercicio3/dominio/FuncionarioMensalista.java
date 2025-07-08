package BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio3.dominio;

public class FuncionarioMensalista extends Funcionario{

    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario Base: " + this.salarioBase);
    }
}
