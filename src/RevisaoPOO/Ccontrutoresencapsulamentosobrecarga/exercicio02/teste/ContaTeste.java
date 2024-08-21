package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio02.teste;

import RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio02.dominio.ContaCorrente;

public class ContaTeste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345", true, 1500);

        conta.depositar(1300);

        conta.sacar(1500);

        conta.depositar(1300);

        conta.consultaConta();
    }
}
