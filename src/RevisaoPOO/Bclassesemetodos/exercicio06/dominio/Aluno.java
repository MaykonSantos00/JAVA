package RevisaoPOO.Bclassesemetodos.exercicio06.dominio;

public class Aluno {
    public String nome;
    public int matricula;
    public String curso;
    public String[] disciplinas;
    public double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String curso) {
        this(nome);
        this.curso = curso;
    }
}
