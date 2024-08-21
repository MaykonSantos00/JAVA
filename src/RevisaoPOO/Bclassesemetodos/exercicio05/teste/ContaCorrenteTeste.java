package RevisaoPOO.Bclassesemetodos.exercicio05.teste;

import RevisaoPOO.Bclassesemetodos.exercicio05.dominio.ContaCorrente;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.limite = 2000;
        conta.numero = "12345";
        conta.saldo = 3000;
        conta.especial = false;

        System.out.println("Numero Conta: " + conta.numero);
        System.out.println("Saldo Conta: " + conta.saldo);
        System.out.println("Especial Conta: " + conta.especial);
        System.out.println("Limite Saquê/Depósito: " + conta.limite);
        System.out.println("-----------------------------------------");
        conta.sacar(10);
        conta.depositar(2100);

    }
}
