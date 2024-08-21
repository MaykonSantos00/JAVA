package POO.Ppolimorfismo.servico;

import POO.Ppolimorfismo.dominio.Produto;
import POO.Ppolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto do Produto ");
        double imposto = produto.imposto();
        System.out.println("Imposto do produto " + produto.getNome());
        System.out.println("Valor " + produto.getPreco());
        System.out.println("Imposto a ser pago " + produto.imposto());

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Imposto do Tomate " + tomate.getDataValidade());
        }
    }
}
