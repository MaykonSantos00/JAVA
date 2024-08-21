package POO.Ppolimorfismo.teste;

import POO.Ppolimorfismo.dominio.Computador;
import POO.Ppolimorfismo.dominio.Televisao;
import POO.Ppolimorfismo.dominio.Tomate;
import POO.Ppolimorfismo.servico.CalculadoraImposto;

public class CalculandoImpostoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac10", 5000);
        Tomate tomate = new Tomate("Tomate Vermelho", 20);
        Televisao tv = new Televisao("Samsung 50\" ", 20);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
