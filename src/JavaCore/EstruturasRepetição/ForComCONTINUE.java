package JavaCore.EstruturasRepetição;

public class ForComCONTINUE {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;// VALOR DA PARCELA ESTÁ AUMENTANDO
            if (valorParcela < 1000) continue;
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);

        }

    }
}
