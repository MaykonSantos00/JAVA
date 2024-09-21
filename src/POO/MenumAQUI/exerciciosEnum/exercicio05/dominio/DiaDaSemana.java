package POO.MenumAQUI.exerciciosEnum.exercicio05.dominio;

public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public int diasEntre(DiaDaSemana outro) {
        return Math.abs(this.ordinal() - outro.ordinal());
    }

}
