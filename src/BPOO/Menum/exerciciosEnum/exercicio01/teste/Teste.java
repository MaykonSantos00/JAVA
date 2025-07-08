package BPOO.Menum.exerciciosEnum.exercicio01.teste;

import BPOO.Menum.exerciciosEnum.exercicio01.dominio.Mes;
import BPOO.Menum.exerciciosEnum.exercicio01.dominio.RetornaDiasMes;

public class Teste {
    public static void main(String[] args) {
        RetornaDiasMes retornaDiasMes = new RetornaDiasMes();

        retornaDiasMes.retornaDiasMes(Mes.DEZEMBRO);
    }
}
