package POO.Hassociacao.Exercicio.teste;

import POO.Hassociacao.Exercicio.dominio.Aluno;
import POO.Hassociacao.Exercicio.dominio.Local;
import POO.Hassociacao.Exercicio.dominio.Professor;
import POO.Hassociacao.Exercicio.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("Festa Konoha");
        Local local = new Local("Capanema");
        Aluno aluno = new Aluno("Jeronilson", 22);
        Professor professor = new Professor("Jeberval", "Uchiha");

        Seminario[] seminarios = {seminario};
        professor.setSeminario(seminarios);
        Aluno[] alunos = {aluno};
        aluno.setSeminario(seminario);
        seminario.setAluno(alunos);
        seminario.setLocal(local);

        aluno.imprime();
        System.out.println("###################");
        seminario.impressao();
        System.out.println("#####################");
        professor.imprime();
    }
}
