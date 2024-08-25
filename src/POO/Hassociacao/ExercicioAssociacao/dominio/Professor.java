package POO.Hassociacao.ExercicioAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        setNome(nome);
        setEspecialidade(especialidade);
    }

    public void imprime() {
        if (seminarios == null) return;
        System.out.println("Nome : " + getNome());
        System.out.println("Especialidade : " + getEspecialidade());
        for (Seminario s : seminarios) {
            System.out.print("Titulo : " + s.getTitulo() + " ");
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
