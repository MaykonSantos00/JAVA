package RevisaoPOO.Bclassesemetodos.exercicio04.teste;

import RevisaoPOO.Bclassesemetodos.exercicio04.dominio.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.corLuz = "Amarelo";
        lampada.formato = "Redondo";
        lampada.tipoDeLampada = "Led";
        lampada.marca = "Galaxyled";
        lampada.consumoW = "2.3";
        lampada.tensaoEletrica = "220";

        System.out.println("Marca: " + lampada.marca);
        System.out.println("Tipo de Lampada: " + lampada.tipoDeLampada);
        System.out.println("Cor: " + lampada.corLuz);
        System.out.println("Formato: " + lampada.formato);
        System.out.println("Consumo: " + lampada.consumoW);
        System.out.println("Tensão: " + lampada.tensaoEletrica);

        System.out.println("--------------------------------");

        lampada.ligar();
        lampada.desligar();
    }
}
