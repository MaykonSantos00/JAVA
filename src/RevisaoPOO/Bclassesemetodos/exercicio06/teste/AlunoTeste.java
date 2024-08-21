package RevisaoPOO.Bclassesemetodos.exercicio06.teste;

import RevisaoPOO.Bclassesemetodos.exercicio06.dominio.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("kk");

        aluno.nome = "Garibaldo";
        aluno.matricula = 12345;
        aluno.curso = "Engenharia Elétrica";

        aluno.disciplinas = new String[3];
        aluno.notas = new double[4];
        double media = 0;

        System.out.println("Nome Aluno: " + aluno.nome);
        System.out.println("Número de Matricula: " + aluno.matricula);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Disciplinas:");

        aluno.disciplinas[0] = "Matemática";
        aluno.notas[0] = 7;
        aluno.notas[1] = 7;
        aluno.notas[2] = 7;
        aluno.notas[3] = 7;
        System.out.print(aluno.disciplinas[0]);
        for (double nota : aluno.notas) {
            media += nota;
        }
        System.out.println(" - Média: " + media / aluno.notas.length);


        aluno.disciplinas[1] = "Cálculo Diferencial";
        aluno.notas[0] = 9;
        aluno.notas[1] = 4;
        aluno.notas[2] = 2;
        aluno.notas[3] = 8;
        System.out.print(aluno.disciplinas[1]);
        media = 0;
        for (double nota : aluno.notas) {
            media += nota;
        }
        System.out.println(" - Média: " + media / aluno.notas.length);

        aluno.disciplinas[2] = "Geometrial Analítica";
        aluno.notas[0] = 2;
        aluno.notas[1] = 10;
        aluno.notas[2] = 10;
        aluno.notas[3] = 4;
        System.out.print(aluno.disciplinas[2]);
        media = 0;
        for (double nota : aluno.notas) {
            media += nota;
        }
        System.out.println(" - Média: " + media / aluno.notas.length);


    }
}
