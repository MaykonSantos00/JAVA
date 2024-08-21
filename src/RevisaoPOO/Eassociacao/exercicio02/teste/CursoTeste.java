package RevisaoPOO.Eassociacao.exercicio02.teste;

import RevisaoPOO.Eassociacao.exercicio02.dominio.Aluno;
import RevisaoPOO.Eassociacao.exercicio02.dominio.Curso;
import RevisaoPOO.Eassociacao.exercicio02.dominio.Professor;

import java.util.Scanner;

public class CursoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso("Electrical Engineer", "10:30");

        Professor professor = new Professor("Aderbal", "Geometria Analítica");
        professor.setEmail("aderbal@gmail.com");

        Aluno aluno1 = new Aluno("Maykon Tavares", "202307140082");
        System.out.println("Digite Quatro notas para o aluno " + aluno1.getNome() + ": ");
        for (int i = 0; i < aluno1.getNotas().length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            aluno1.setNotasPos(i, sc.nextDouble());

        }

        Aluno aluno2 = new Aluno("Isabelinha Nike", "202307140022");
        System.out.println("Digite Quatro notas para o aluno " + aluno2.getNome() + ": ");
        for (int i = 0; i < aluno2.getNotas().length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            aluno2.setNotasPos(i, sc.nextDouble());

        }

        Aluno aluno3 = new Aluno("Mk Pouca Midia", "202307140033");
        System.out.println("Digite Quatro notas para o aluno " + aluno3.getNome() + ": ");
        for (int i = 0; i < aluno3.getNotas().length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            aluno3.setNotasPos(i, sc.nextDouble());

        }

        Aluno aluno4 = new Aluno("Luan Boleragem", "202307140022");
        System.out.println("Digite Quatro notas para o aluno " + aluno4.getNome() + ": ");
        for (int i = 0; i < aluno4.getNotas().length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            aluno4.setNotasPos(i, sc.nextDouble());

        }

        Aluno aluno5 = new Aluno("Estudante", "202307140071");
        System.out.println("Digite Quatro notas para o aluno " + aluno5.getNome() + ": ");
        for (int i = 0; i < aluno5.getNotas().length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            aluno5.setNotasPos(i, sc.nextDouble());

        }

        curso.setProfessor(professor);
        Aluno[] alunos = new Aluno[5];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;
        curso.setAlunos(alunos);

        curso.imprimeCurso();


    }
}
