package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        Estudante est2 = new Estudante();

        est.nome = "Midori";
        est.idade = 20;
        est.sexo = 'M';

        est2.nome = "Missori";
        est2.idade = 25;
        est2.sexo = 'F';

        est.imprime();
        System.out.println("-------------------------------------");
        est2.imprime();


    }
}
