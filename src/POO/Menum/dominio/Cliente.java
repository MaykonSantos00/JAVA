package POO.Menum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipocliente;
    private MetodoPagamento meodoPagamento;

    public Cliente(String nome, TipoCliente tipocliente, MetodoPagamento meodoPagamento) {
        this.nome = nome;
        this.tipocliente = tipocliente;
        this.meodoPagamento = meodoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipocliente=" + tipocliente.getRelatorio() +
                ", tipoclienteID=" + tipocliente.getTipo() +
                ", meodoPagamento=" + meodoPagamento +
                '}';
    }
}
