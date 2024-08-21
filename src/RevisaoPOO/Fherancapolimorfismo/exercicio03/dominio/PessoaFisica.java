package RevisaoPOO.Fherancapolimorfismo.exercicio03.dominio;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, double renda, String cpf) {
        super(nome, renda);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "Nome= " + super.getNome() +
                "; Renda= " + super.getRenda() +
                "; cpf='" + cpf +
                "; Imposto= " + calculaImposto() +
                '}';
    }

    @Override
    public double calculaImposto() {
        return super.getRenda() * 0.1;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
