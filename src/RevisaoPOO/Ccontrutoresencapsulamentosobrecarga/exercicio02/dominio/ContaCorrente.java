package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio02.dominio;

public class ContaCorrente {

    private String numero;
    private boolean especial;
    private double saldo;
    private double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, boolean especial, double limite) {
        this.numero = numero;
        this.especial = especial;
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            if (especial) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Saldo atual: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente!");
                return;
            }
        } else if (valor < 0) {
            System.out.println("Valor inválido");
            return;
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }

    public void depositar(double valor) {
        if (valor < 0 || valor > limite) {
            System.out.println("Deposito inválido");
            return;
        } else {
            saldo += valor;
            System.out.println("Depositado com sucesso");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }

    public void consultaConta() {
        System.out.println("Saldo atual: R$" + saldo);
        if (especial) {
            System.out.println("Conta Especial");
        } else {
            System.out.println("Conta Não especial");
        }
    }


}
