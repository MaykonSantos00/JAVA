package POO.Hassociacao.ExercicioAssociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo){
        this.titulo = titulo;
    };

    public void imprimir(){
        if (alunos == null || local == null)return;
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Endereco: " + this.local.getEndereco());
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + " ");
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
