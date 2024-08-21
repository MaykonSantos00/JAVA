package RevisaoPOO.Fherancapolimorfismo.exercicio02.dominio;

public class Contribuinte {

    private String nome;
    private double salario;
    private TipoContribuinte tipoContribuinte;

    public Contribuinte(String nome, double salario, TipoContribuinte tipoContribuinte) {
        this.nome = nome;
        this.salario = salario;
        this.tipoContribuinte = tipoContribuinte;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", tipoContribuinte=" + tipoContribuinte +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoContribuinte getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(TipoContribuinte tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }
}
