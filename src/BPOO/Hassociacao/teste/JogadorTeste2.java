package BPOO.Hassociacao.teste;

import BPOO.Hassociacao.dominio.Jogador;
import BPOO.Hassociacao.dominio.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo Nazário");
        Time time = new Time("Real Madrid");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
