package POO.MenumAQUI.exerciciosEnum.exercicio02.teste;

import POO.MenumAQUI.exerciciosEnum.exercicio02.dominio.OperacaoMatematica;

public class Main {
    public static void main(String[] args) {

        for (OperacaoMatematica value : OperacaoMatematica.values()) {
            System.out.println(value.calcular(2, 2));
        }
    }
}
