package POO.MenumAQUI.exerciciosEnum.exercicio04.dominio;

public enum TipoVeiculo {
    CARRO(4, "Suporta até 5 pessoas."), MOTO(2, "Suporta até 2 pessoas"),
    CAMINHAO(6, "Suporta até 2 pessoas");

    private int qtdRodas;
    private String descricao;

    TipoVeiculo(int qtdRodas, String descricao) {
        this.qtdRodas = qtdRodas;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return "TipoVeiculo{" +
                "Nome='" + this.name() +
                ", qtdRodas=" + getQtdRodas() +
                ", descricao=" + getDescricao() +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }
}
