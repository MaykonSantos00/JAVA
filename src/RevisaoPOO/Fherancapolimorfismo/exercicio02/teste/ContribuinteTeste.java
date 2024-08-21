package RevisaoPOO.Fherancapolimorfismo.exercicio02.teste;


import RevisaoPOO.Fherancapolimorfismo.exercicio02.dominio.Contribuinte;
import RevisaoPOO.Fherancapolimorfismo.exercicio02.dominio.ReceitaFederal;
import RevisaoPOO.Fherancapolimorfismo.exercicio02.dominio.TipoContribuinte;

public class ContribuinteTeste {
    public static void main(String[] args) {
        ReceitaFederal receitaFederal = new ReceitaFederal();

        System.out.println("--- Receita Federal ---\n");

        Contribuinte contribuinte1 = new Contribuinte("Maykon", 2000, TipoContribuinte.PESSOA_JURIDICA);
        System.out.println(contribuinte1);
        receitaFederal.calculaImposto(contribuinte1);

        System.out.println("------------------------------");

        Contribuinte contribuinte2 = new Contribuinte("Libera", 2000, TipoContribuinte.PESSOA_FISICA);
        System.out.println(contribuinte2);
        receitaFederal.calculaImposto(contribuinte2);

        System.out.println("------------------------------");

        Contribuinte contribuinte3 = new Contribuinte("Mkzin", 5000, TipoContribuinte.PESSOA_JURIDICA);
        System.out.println(contribuinte3);
        receitaFederal.calculaImposto(contribuinte3);

        System.out.println("------------------------------");

        Contribuinte contribuinte4 = new Contribuinte("Libera", 7000, TipoContribuinte.PESSOA_FISICA);
        System.out.println(contribuinte4);
        receitaFederal.calculaImposto(contribuinte4);

        System.out.println("------------------------------");

        Contribuinte contribuinte5 = new Contribuinte("Maykon", 1500, TipoContribuinte.PESSOA_JURIDICA);
        System.out.println(contribuinte5);
        receitaFederal.calculaImposto(contribuinte5);

        System.out.println("------------------------------");

        Contribuinte contribuinte6 = new Contribuinte("Libera", 20000, TipoContribuinte.PESSOA_FISICA);
        System.out.println(contribuinte6);
        receitaFederal.calculaImposto(contribuinte6);

    }
}
