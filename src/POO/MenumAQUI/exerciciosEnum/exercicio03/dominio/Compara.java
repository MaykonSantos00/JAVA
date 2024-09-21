package POO.MenumAQUI.exerciciosEnum.exercicio03.dominio;

public class Compara {

    public void comparaNiveis(NivelPrioridade nivelPrioridade1, NivelPrioridade nivelPrioridade2) {
        if (nivelPrioridade1.getValorPrioridade() == nivelPrioridade2.getValorPrioridade()) {
            System.out.println("Niveis iguais");
        } else if (nivelPrioridade1.getValorPrioridade() > nivelPrioridade2.getValorPrioridade()) {
            System.out.println("nivelPrioridade1 > nivelPrioridade2");
        } else {
            System.out.println("nivelPrioridade1 < nivelPrioridade2");
        }
    }
}
