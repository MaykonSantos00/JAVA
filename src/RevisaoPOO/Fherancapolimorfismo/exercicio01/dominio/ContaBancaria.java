package RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo= R$" + saldo +
                '}';
    }

    public void sacar(double valor) {
        if (valor < 0 || valor > this.saldo) {
            System.out.println("Saque Inválido");
        } else {
            this.saldo -= valor;
            System.out.println("Saque Realizado com sucesso");
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Deposito Inválido");
        } else {
            this.saldo += valor;
            System.out.println("Deposito Realizado com sucesso");
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
