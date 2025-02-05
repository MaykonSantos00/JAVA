package ExerciciosPOO.Exercise16.test;

import ExerciciosPOO.Exercise16.domain.Genero;
import ExerciciosPOO.Exercise16.domain.Livro;
import ExerciciosPOO.Exercise16.domain.Revista;
import ExerciciosPOO.Exercise16.domain.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Charles duhigg", "O Poder do Hábito", 10,
                Genero.DESENVOLVIMENTO_PESSOAL);
        Livro livro2 = new Livro("Jamer Clear", "Hábitos Atômicos", 10,
                Genero.DESENVOLVIMENTO_PESSOAL);
        Livro livro3 = new Livro("+ Esperto que o Diabo", "Napoleon Hill", 10,
                Genero.DESENVOLVIMENTO_PESSOAL);
        Revista revista1 = new Revista("Messi", "8 Bolas de Ouro", 10, "12/10/2024",
                1);
        Revista revista2 = new Revista("Cr7", "o Melhor", 10, "12/10/2025",
                1);
        Revista revista3 = new Revista("Neymar", "o Caos Perfeito", 10, "12/10/2025",
                1);


        Usuario usuario = new Usuario("Maykon", 12345);

        usuario.emprestarItem(livro1);
        usuario.devolverItem(livro1);
    }
}
