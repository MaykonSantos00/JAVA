package POO.Ppolimorfismo.dominio;

public class Computador extends Produto {
    public static final double TAXA_PRODUTO_POR_CENTO = 0.21;

    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double imposto() {
        System.out.println("Computador imposto: ");
        return this.preco * TAXA_PRODUTO_POR_CENTO;
    }
}
