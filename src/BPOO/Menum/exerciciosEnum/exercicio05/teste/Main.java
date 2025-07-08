package BPOO.Menum.exerciciosEnum.exercicio05.teste;

import BPOO.Menum.exerciciosEnum.exercicio05.dominio.DiaDaSemana;

public class Main {
    public static void main(String[] args) {

        DiaDaSemana diaDaSemana = DiaDaSemana.SABADO;
        System.out.println(diaDaSemana.diasEntre(DiaDaSemana.DOMINGO));
    }
}
