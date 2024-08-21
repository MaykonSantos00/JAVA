package POO.Hassociacao.teste;

import POO.Hassociacao.dominio.Jogador;
import POO.Hassociacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Eto");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Barcelona");
        time.setJogador(jogadores);

        System.out.println("-- Jogador1 --");
        jogador1.setTime(time);
        jogador1.imprime();

        System.out.println("-- Jogador2 --");
        jogador2.setTime(time);
        jogador2.imprime();

        System.out.println("-- Time --");
        time.imprime();
    }
}
