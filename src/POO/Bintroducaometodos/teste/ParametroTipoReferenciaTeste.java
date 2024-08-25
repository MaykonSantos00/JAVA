package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.Impressora;
import POO.Bintroducaometodos.dominio.ParametroTipoReferencia;

public class ParametroTipoReferenciaTeste {
    public static void main(String[] args) {
        ParametroTipoReferencia obj1 = new ParametroTipoReferencia();
        ParametroTipoReferencia obj2 = new ParametroTipoReferencia();
        Impressora imprimer = new Impressora();

        obj1.nome = "carlinhos";
        obj1.idade = 20;
        obj1.sexo = 'M';

        obj2.nome = "Taise";
        obj2.idade = 20;
        obj2.sexo = 'F';

        imprimer.Impressora(obj1);
        System.out.println("--------------------------");
        imprimer.Impressora(obj2);

    }
}
