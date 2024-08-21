package RevisaoPOO.Eassociacao.exercicio02.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public void imprimeCurso() {
        System.out.println("#### Curso ####");
        System.out.println("Curso: " + this.nome);
        System.out.println("Horario: " + this.horario);
        if (professor == null) return;
        System.out.println("#### Professor ####");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Departamento: " + professor.getDepartamento());
        System.out.println("Email: " + professor.getEmail());
        System.out.println("#### Alunos ####");
        if (alunos == null) return;
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("N\' De Matricula: " + alunos[i].getMatricula());
            System.out.print("Notas:");
            if (alunos[i].getNotas() == null) return;
            for (int j = 0; j < alunos[i].getNotas().length; j++) {
                System.out.print(alunos[i].getNotas()[j] + " ");
            }
            System.out.println();
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


}
