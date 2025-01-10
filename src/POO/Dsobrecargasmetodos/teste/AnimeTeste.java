package POO.Dsobrecargasmetodos.teste;

import POO.Dsobrecargasmetodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.inicializacao("Dora Aventureira", 300,"Aventura-Infantil");
        anime.imprime();
    }
}
