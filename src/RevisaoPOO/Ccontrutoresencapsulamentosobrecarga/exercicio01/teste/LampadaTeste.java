package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio01.teste;

import RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio01.dominio.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {

        Lampada lampada = new Lampada("Phillips");

        lampada.setTipoDeLampada("Redonda");
        lampada.setConsumoW("220");
        lampada.setCorLuz("Amarelo");
        lampada.setFormato("Triangular");
        lampada.setTensaoEletrica("220");

        System.out.println(lampada.getTipoDeLampada());
        System.out.println(lampada.getMarca());
        System.out.println(lampada.getConsumoW());
        System.out.println(lampada.getCorLuz());

        lampada.ligar();
        lampada.desligar();
    }
}
