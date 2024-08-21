package RevisaoPOO.Fherancapolimorfismo.exercicio03.dominio;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double renda, String cnpj) {
        super(nome, renda);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "Nome= " + super.getNome() +
                "; Renda= " + super.getRenda() +
                "; cnpj='" + cnpj +
                "; Imposto= " + calculaImposto() +
                '}';
    }

    @Override
    public double calculaImposto() {
        if (super.getRenda() >= 0 && super.getRenda() <= 1400) {
            return 0;
        } else if (super.getRenda() > 1400 && super.getRenda() <= 2100) {
            return (super.getRenda() * 0.1);
        } else if (super.getRenda() > 2100 && super.getRenda() <= 2800) {
            return (super.getRenda() * 0.15);
        } else if (super.getRenda() > 2800 && super.getRenda() <= 3600) {
            return (super.getRenda() * 0.25);
        } else if (super.getRenda() > 3600) {
            return (super.getRenda() * 0.3);
        } else {
            System.out.println("Salario Inválido");
        }
        return 0;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
