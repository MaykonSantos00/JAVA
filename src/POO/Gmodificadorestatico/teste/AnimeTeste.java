package POO.Gmodificadorestatico.teste;

import POO.Gmodificadorestatico.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Dora");
        System.out.println("--------------------------------------");
        Anime anime1 = new Anime();
        System.out.println("--------------------------------------");
        Anime anime2 = new Anime("RS", 1);

//        System.out.println("\n");
//        for (int i : anime.getEp()) {
//            System.out.print(i + " ");
//        }
    }
}
