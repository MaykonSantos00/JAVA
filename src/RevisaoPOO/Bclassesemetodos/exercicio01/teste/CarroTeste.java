package RevisaoPOO.Bclassesemetodos.exercicio01.teste;

import RevisaoPOO.Bclassesemetodos.exercicio01.dominio.Carro;

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

        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.comsumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numPassageiros);
        System.out.println(fusca.capCombustivel);
        System.out.println(fusca.comsumoCombustivel);
        van.exibirAutonomia();
    }
}
