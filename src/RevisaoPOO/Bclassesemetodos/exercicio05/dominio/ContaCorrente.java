package RevisaoPOO.Bclassesemetodos.exercicio05.dominio;

public class ContaCorrente {
    public String numero;
    public double saldo;
    public double limite;
    public boolean especial;


    public void sacar(double valor) {
        if (valor < 0 || valor > limite || valor > saldo) {
            System.out.println("Saquê inválido");
        } else {
            System.out.println("Saquê realizado com sucesso");
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor < 0 || valor > limite) {
            System.out.println("Depósito Inválido");
        } else {
            System.out.println("Depósito realizado com sucesso");
            saldo += valor;
        }
    }

}
