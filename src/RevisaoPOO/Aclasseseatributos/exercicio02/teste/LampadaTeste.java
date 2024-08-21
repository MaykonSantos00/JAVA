package RevisaoPOO.Aclasseseatributos.exercicio02.teste;

import RevisaoPOO.Aclasseseatributos.exercicio02.dominio.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.marca = "phillips";
        lampada.tipoLuz = "Amarela";
        lampada.volts = 220;
        lampada.valor = 5;

        System.out.println("--- Mercadão do Armazem ---");
        System.out.println("Marca: " + lampada.marca);
        System.out.println("Tipo de Luz: " + lampada.tipoLuz);
        System.out.println("Volts: " + lampada.volts);
        System.out.println("Valor: " + lampada.valor);

    }
}
