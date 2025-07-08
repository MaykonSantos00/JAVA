package BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio3.teste;

import BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio3.dominio.FuncionarioHorista;
import BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio3.dominio.FuncionarioMensalista;

public class teste {
    public static void main(String[] args) {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Maykinho Net",10000, 100);
        funcionarioHorista.calcularSalario();
        System.out.println("----------------------------------------------------------------");
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("Mary Miller",20000);
        funcionarioMensalista.calcularSalario();
    }
}
