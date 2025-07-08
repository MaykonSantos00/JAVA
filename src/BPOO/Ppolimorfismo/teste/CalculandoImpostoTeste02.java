package BPOO.Ppolimorfismo.teste;

import BPOO.Ppolimorfismo.dominio.Computador;
import BPOO.Ppolimorfismo.dominio.Produto;
import BPOO.Ppolimorfismo.dominio.Tomate;
import BPOO.Ppolimorfismo.servico.CalculadoraImposto;

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
