package POO.Cmodificadoracesso.teste;

import POO.Cmodificadoracesso.dominio.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Cristiano Ronaldo");
        aluno.setIdade(40);

        aluno.impressao();

    }
}
