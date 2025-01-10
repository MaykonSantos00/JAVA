package POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio3.dominio;

public abstract class Funcionario {
    public String nome;
    public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract void calcularSalario();

}
