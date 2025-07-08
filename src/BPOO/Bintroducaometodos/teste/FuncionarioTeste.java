package BPOO.Bintroducaometodos.teste;

import BPOO.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maykon");
        funcionario.setIdade(20);
        double[] salarios = {15000, 3000, 5000};
        funcionario.setSalario(salarios);

        funcionario.imprime();
        funcionario.mediaSalario();
    }
}
