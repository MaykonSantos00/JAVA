package BPOO.Hassociacao.ExercicioAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Especialidade do professor: " + especialidade);
        if(seminarios == null){
            System.out.println(getNome() + " não está ministrando seminário algum");
        }else{
            System.out.println("Seminarios: ");
            for (Seminario seminario : seminarios) {
                System.out.print(seminario.getTitulo() + " ");
            }
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
