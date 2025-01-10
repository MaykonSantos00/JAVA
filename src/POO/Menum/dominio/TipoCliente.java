package POO.Menum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int tipo;
    private String Relatorio;

    TipoCliente(int num, String relatorio) {
        this.tipo = num;
        this.Relatorio = relatorio;
    }

    public static TipoCliente getTipoCliente(String relatorio) {
        for (TipoCliente tipo : TipoCliente.values()) {
            if (tipo.getRelatorio().equals(relatorio)) {
                return tipo;
            }
        }
        return null;
    }

    public String getRelatorio() {
        return Relatorio;
    }

    public void setRelatorio(String relatorio) {
        Relatorio = relatorio;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
