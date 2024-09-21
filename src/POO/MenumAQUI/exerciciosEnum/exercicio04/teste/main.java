package POO.MenumAQUI.exerciciosEnum.exercicio04.teste;

import POO.MenumAQUI.exerciciosEnum.exercicio04.dominio.TipoVeiculo;

public class main {
    public static void main(String[] args) {
        for (TipoVeiculo veiculos : TipoVeiculo.values()) {
            System.out.println(veiculos);
        }

    }
}
