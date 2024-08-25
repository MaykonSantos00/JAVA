package POO.Hassociacao.ExercicioAssociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        setTitulo(titulo);
    }

    public Seminario(String titulo, Local local) {
        this(titulo);
        setLocal(local);
    }

    public void imprime() {
        if (getAlunos() == null && getLocal() == null) return;
        System.out.println("Titulo : " + getTitulo());
        System.out.println("Local : " + getLocal().getEndereco());
        System.out.println("Alunos : ");
        for (Aluno aluno : getAlunos()) {
            System.out.println("Nome : " + aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
