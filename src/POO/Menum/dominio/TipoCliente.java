package POO.Menum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int tipo;
    private String relatorio;

    TipoCliente(int tipo, String relatorio) {
        this.tipo = tipo;
        this.relatorio = relatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public int getTipo() {
        return tipo;
    }
}
