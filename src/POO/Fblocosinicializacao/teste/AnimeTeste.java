package POO.Fblocosinicializacao.teste;

import POO.Fblocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Dora");

        anime.imprime();

        System.out.println("\n");
        for (int i : anime.getEp()) {
            System.out.print(i + " ");
        }
    }
}
