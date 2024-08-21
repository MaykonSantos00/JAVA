package POO.Gmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] ep;
    // 0 - Bloco de inicialização estatico é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao estático 1");
        Anime.ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao não estático");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
    }

    public Anime(String nome, int... ep) {
        this.nome = nome;
        Anime.ep = ep;
    }

    public void imprime() {
        System.out.println(this.nome);
        for (int i : ep) {
            System.out.println(i);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEp() {
        return ep;
    }
}
