package POO.MenumAQUI.exerciciosEnum.exercicio03.dominio;

public enum NivelPrioridade {

    BAIXO(1), MEDIO(2), ALTO(3);

    private int valorPrioridade;

    NivelPrioridade(int valorPrioridade) {
        this.valorPrioridade = valorPrioridade;
    }

    public int getValorPrioridade() {
        return valorPrioridade;
    }
}
