package POO.Jheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de pessoa ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2 ");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro  do construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        if (this.endereco == null) return;
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco.getRua());
        System.out.println("Endereco: " + endereco.getNumero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
