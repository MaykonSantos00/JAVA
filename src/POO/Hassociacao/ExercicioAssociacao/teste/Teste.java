package POO.Hassociacao.ExercicioAssociacao.teste;

import POO.Hassociacao.ExercicioAssociacao.dominio.Aluno;
import POO.Hassociacao.ExercicioAssociacao.dominio.Local;
import POO.Hassociacao.ExercicioAssociacao.dominio.Professor;
import POO.Hassociacao.ExercicioAssociacao.dominio.Seminario;

public class Teste {
    public static void main(String[] args) {
        Local local = new Local("Passagem miracy, N\"67");
        Seminario seminario = new Seminario("Festa Konoha", local);

        Aluno aluno1 = new Aluno("Maykon", 21);
        aluno1.setSeminario(seminario);

        Aluno aluno2 = new Aluno("Juan", 22);
        aluno2.setSeminario(seminario);

        Aluno[] alunos = {aluno1, aluno2};
        seminario.setAlunos(alunos);

        Professor professor = new Professor("Darlindo", "Tec. Enfermagem");
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        System.out.println("-- Seminario --");
        seminario.imprime();

        System.out.println("-- Aluno(s) --");
        aluno1.imprime();
        System.out.println("------------");
        aluno2.imprime();

        System.out.println("-- Professor --");
        professor.imprime();
    }
}
