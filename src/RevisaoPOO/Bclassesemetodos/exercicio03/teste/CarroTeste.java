package RevisaoPOO.Bclassesemetodos.exercicio03.teste;

import RevisaoPOO.Bclassesemetodos.exercicio03.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducati";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.comsumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.comsumoCombustivel);
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        //System.out.println("A autonomia do Carro é: " + van.obterAutonomia());
        //System.out.println("A autonomia do Carro é: " + autonomia);

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

    }
}
