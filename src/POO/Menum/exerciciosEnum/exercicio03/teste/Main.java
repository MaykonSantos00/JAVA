package POO.Menum.exerciciosEnum.exercicio03.teste;

import POO.Menum.exerciciosEnum.exercicio03.dominio.Compara;
import POO.Menum.exerciciosEnum.exercicio03.dominio.NivelPrioridade;

public class Main {
    public static void main(String[] args) {
        Compara compara = new Compara();

        compara.comparaNiveis(NivelPrioridade.MEDIO, NivelPrioridade.MEDIO);
    }
}
