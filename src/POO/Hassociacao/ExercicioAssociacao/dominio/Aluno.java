package POO.Hassociacao.ExercicioAssociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public void imprime() {
        if (seminario == null) return;
        System.out.println("Nome : " + getNome());
        System.out.println("Idade : " + getIdade());
        System.out.println("Seminario : " + getSeminario().getTitulo());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
