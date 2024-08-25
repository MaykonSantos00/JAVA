package POO.Hassociacao.teste;

import POO.Hassociacao.dominio.Jogador;

public class JogadorTeste1 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Ronaldo Nazário");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Zico");
        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador j : jogadores) {
            j.imprime();
        }
    }
}
