package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();

        est1.nome = "Midori";
        est1.idade = 20;
        est1.sexo = 'M';

        est2.nome = "Missori";
        est2.idade = 25;
        est2.sexo = 'F';

        est1.imprime();
        System.out.println("-------------------------------------");
        est2.imprime();


    }
}
