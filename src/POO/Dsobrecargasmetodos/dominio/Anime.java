package POO.Dsobrecargasmetodos.dominio;

public class Anime {
    private String nome;
    private int ep;
    private String genero;

    public void inicializacao(String nome, int ep) {
        setNome(nome);
        setEp(ep);
    }

    public void inicializacao(String nome, int ep, String genero) {
        this.inicializacao(nome, ep);
        setGenero(genero);
    }

    public void imprime() {
        System.out.println("Nome do Anime: " + getNome());
        System.out.println("Tipo do Anime: " + getEp());
        System.out.println("Genero do Anime: " + getGenero());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
