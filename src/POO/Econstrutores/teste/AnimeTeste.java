package POO.Econstrutores.teste;

import POO.Econstrutores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Dora", 40, "Aventura", "Serie", "Marvel");
        anime.imprime();
    }
}
