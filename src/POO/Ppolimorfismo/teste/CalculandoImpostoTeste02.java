package POO.Ppolimorfismo.teste;

import POO.Ppolimorfismo.dominio.Computador;
import POO.Ppolimorfismo.dominio.Produto;
import POO.Ppolimorfismo.dominio.Televisao;
import POO.Ppolimorfismo.dominio.Tomate;
import POO.Ppolimorfismo.servico.CalculadoraImposto;

public class CalculandoImpostoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac10", 5000);
        Tomate tomate = new Tomate("Tomate Vermelho", 20);
        tomate.setDataValidade("1/2/3333");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
