package POO.Hassociacao.dominio;

public class Escola {
    private String nome;
    private Aluno[] aluno;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Aluno[] aluno) {
        this(nome);
        this.aluno = aluno;
    }

    public void imprime() {
        if (aluno == null) return;
        System.out.println("Nome: " + nome);
        for (Aluno alunos : aluno) {
            System.out.println("Aluno: " + alunos.getNome());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
