package POO.Ppolimorfismo.dominio;

public class Tomate extends Produto {
    private String dataValidade;
    public static final double TAXA_PRODUTO_POR_CENTO = 0.15;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double imposto() {
        System.out.println("tomate imposto: ");
        return this.preco * TAXA_PRODUTO_POR_CENTO;
    }

}
