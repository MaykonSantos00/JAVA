package POO.Aintroducaoclasses.teste;

import POO.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Kaseo";
        estudante.idade = 29;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
