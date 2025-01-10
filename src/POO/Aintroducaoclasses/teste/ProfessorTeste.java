package POO.Aintroducaoclasses.teste;

import POO.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Hildo";
        professor.idade = 33;
        professor.sexo = 'M';
        professor.materia = "Matemática";
        System.out.println(professor.nome + ", " + professor.idade + ", " + professor.sexo + " e " + professor.materia + ".");
    }
}
