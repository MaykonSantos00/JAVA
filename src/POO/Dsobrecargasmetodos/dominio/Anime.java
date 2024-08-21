package POO.Dsobrecargasmetodos.dominio;

public class Anime {
    private String nome;
    private int ep;
    private String genero;

    public void inicializacao(String nome, int ep) {
        this.nome = nome;
        this.ep = ep;
    }

    public void inicializacao(String nome, int ep, String genero) {
        this.inicializacao(nome, ep);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println("Nome do Anime: " + nome);
        System.out.println("Tipo do Anime: " + ep);
        System.out.println("Genero do Anime: " + genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return ep;
    }

    public void setTipo(int ep) {
        this.ep = ep;
    }
}
