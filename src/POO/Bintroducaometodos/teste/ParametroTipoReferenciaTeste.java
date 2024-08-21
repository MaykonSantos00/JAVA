package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.Impressora;
import POO.Bintroducaometodos.dominio.ParametroTipoReferencia;

public class ParametroTipoReferenciaTeste {
    public static void main(String[] args) {
        ParametroTipoReferencia obj = new ParametroTipoReferencia();
        ParametroTipoReferencia obj2 = new ParametroTipoReferencia();
        Impressora imprimer = new Impressora();

        obj.nome = "carlinhos";
        obj.idade = 20;
        obj.sexo = 'M';

        obj2.nome = "Taise";
        obj2.idade = 20;
        obj2.sexo = 'F';

        imprimer.Impressora(obj);
        System.out.println("--------------------------");
        imprimer.Impressora(obj2);

    }
}
