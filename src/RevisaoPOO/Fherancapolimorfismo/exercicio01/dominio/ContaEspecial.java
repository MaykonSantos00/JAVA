package RevisaoPOO.Fherancapolimorfismo.exercicio01.dominio;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta) {
        super(nomeCliente, numConta);
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + super.getNomeCliente() + '\'' +
                ", numConta='" + super.getNumConta() + '\'' +
                ", saldo= R$" + super.getSaldo() +
                ", limite=" + this.limite +
                '}';
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Valor Inválido");
        } else {
            if (valor <= this.getSaldo()) {
                System.out.println("Saldo Efetuado Com Sucesso");
                this.setSaldo(this.getSaldo() - valor);
            } else {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Devido ao saldo negativo, usaremos o limite especial");
                if (this.getSaldo() <= this.getLimite()) {
                    this.setSaldo(this.getSaldo() + limite);
                } else {
                    this.setSaldo(this.getSaldo() + limite);
                }
            }

        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
