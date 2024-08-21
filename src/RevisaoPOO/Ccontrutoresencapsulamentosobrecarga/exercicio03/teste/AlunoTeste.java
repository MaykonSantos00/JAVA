package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio03.teste;

import RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio03.dominio.Aluno;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(input.nextLine());

        System.out.println("Digite o número de matricula do aluno: ");
        aluno.setMatricula(input.nextLine());

        System.out.println("Digite o nome do curso: ");
        aluno.setCurso(input.nextLine());

        System.out.println("Digite a quantidade de disciplinas que deseja inserir: ");
        int i = input.nextInt();
        aluno.setNomeDisciplina(new String[i]);
        for (i = 0; i < aluno.getNomeDisciplina().length; i++) {
            System.out.println("Disciplina " + (i + 1) + ": ");
            aluno.setNomeDisciplinaPos(i, input.nextLine());
        }

        System.out.println("digite a quantidade de notas que deseja inserir: ");
        int j = input.nextInt();
        aluno.setNotaDisciplinas(new double[i][j]);
        for (i = 0; i < aluno.getNotaDisciplinas().length; i++) {
            System.out.println("Obtendo as notas da disciplina " + (aluno.getNomeDisciplina()[i]));
            for (j = 0; j < aluno.getNotaDisciplinas()[i].length; j++) {
                aluno.setNotaDisciplinaPos(i, j, input.nextDouble());
            }
        }

        aluno.imprimirAluno();

        aluno.verificaAprovado();


    }
}
