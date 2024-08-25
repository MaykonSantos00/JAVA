package POO.Lmodificadorfinal.dominio;

public class Carro {
    private String marca;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public Carro(String marca) {
        setMarca(marca);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
