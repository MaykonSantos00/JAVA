package POO.Hassociacao.ExercicioAssociacao.teste;

import POO.Hassociacao.ExercicioAssociacao.dominio.Aluno;
import POO.Hassociacao.ExercicioAssociacao.dominio.Local;
import POO.Hassociacao.ExercicioAssociacao.dominio.Professor;
import POO.Hassociacao.ExercicioAssociacao.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Festa Konoha");
        Local local = new Local("Belem/PA, Passagem miracy-67");
        Aluno aluno = new Aluno("Itachi Uchiha", 30, seminario);
        Professor professor = new Professor("Kakashi San","Imitar");

        Seminario[] seminarios = {seminario};
        Aluno[] alunos = {aluno};

        seminario.setAlunos(alunos);
        seminario.setLocal(local);
        seminario.imprimir();

        System.out.println("\n---------------------------------------");

        aluno.imprimir();

        System.out.println("\n---------------------------------------");

        professor.setSeminarios(seminarios);
        professor.imprimir();
    }
}
