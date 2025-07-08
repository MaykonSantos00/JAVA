package BPOO.Hassociacao.teste;

import BPOO.Hassociacao.dominio.Aluno;
import BPOO.Hassociacao.dominio.Escola;

public class EscolaTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Naruto Uzumaki");
        Aluno aluno2 = new Aluno("Sasuke Uchiha");
        Aluno[] alunos = {aluno1, aluno2};
        Escola escola = new Escola("Konoha", alunos);

        escola.imprime();
    }
}
