package POO.Hassociacao.dominio;

public class Escola {
    private String nome;
    private Aluno[] alunos;

    public Escola(String nome) {
        setNome(nome);
    }

    public Escola(String nome, Aluno[] aluno) {
        this(nome);
        setAlunos(aluno);
    }

    public void imprime() {
        if (alunos == null) return;
        System.out.println("Nome: " + nome);
        for (Aluno alunos : alunos) {
            System.out.println("Aluno: " + alunos.getNome());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
