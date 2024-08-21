package POO.Hassociacao.Exercicio.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] aluno;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }


    public void impressao() {
        if (this.local == null) {
            System.out.println("Insira um Local");
            return;
        }
        if (this.aluno == null) {
            System.out.println("Insira um Aluno");
            return;
        }
        System.out.println("titulo: " + this.titulo);
        System.out.println("Local: " + this.local.getEndereco());
        for (Aluno alunos : aluno) {
            System.out.println("Aluno: " + alunos.getNome());
        }

    }

    public Aluno[] getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
