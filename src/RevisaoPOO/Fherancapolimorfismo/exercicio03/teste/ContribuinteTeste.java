package RevisaoPOO.Fherancapolimorfismo.exercicio03.teste;

import RevisaoPOO.Fherancapolimorfismo.exercicio03.dominio.Contribuinte;
import RevisaoPOO.Fherancapolimorfismo.exercicio03.dominio.PessoaFisica;
import RevisaoPOO.Fherancapolimorfismo.exercicio03.dominio.PessoaJuridica;

public class ContribuinteTeste {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Maykon", 3000, "2332332332-99");
        PessoaFisica pf2 = new PessoaFisica("Mkizin", 2222, "2332332332-99");
        PessoaFisica pf3 = new PessoaFisica("Maykon", 5000, "2332332332-99");

        PessoaJuridica pj1 = new PessoaJuridica("Kant", 35000, "2332332332-99");
        PessoaJuridica pj2 = new PessoaJuridica("Orochi", 2000000, "2222332332-99");
        PessoaJuridica pj3 = new PessoaJuridica("DUDU", 15000, "23322332-99");


        Contribuinte[] contribuinte = new Contribuinte[6];
        contribuinte[0] = pf1;
        contribuinte[1] = pf2;
        contribuinte[2] = pf3;
        contribuinte[3] = pj1;
        contribuinte[4] = pj2;
        contribuinte[5] = pj3;

        for (Contribuinte c : contribuinte) {
            System.out.println(c);
        }
    }
}