package RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio;

public class ContaPoupanca extends ContaBancaria {
    private double diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "nomeCliente='" + super.getNomeCliente() + '\'' +
                ", numConta='" + super.getNumConta() + '\'' +
                ", saldo= R$" + super.getSaldo() +
                ", diaRendimento=" + diaRendimento +
                '}';
    }

    public void calculaNovoSaldo() {
        super.setSaldo(getSaldo() + this.diaRendimento);
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        if (diaRendimento < 0) {
            return;
        } else {
            this.diaRendimento = diaRendimento;
        }
    }
}
