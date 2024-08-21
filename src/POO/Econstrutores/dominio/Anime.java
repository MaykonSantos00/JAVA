package POO.Econstrutores.dominio;

public class Anime {
    private String nome;
    private int ep;
    private String genero;
    private String tipo;
    private String estudio;

    public Anime(String nome, int ep, String genero) {
        this.nome = nome;
        this.ep = ep;
        this.genero = genero;
    }

    public Anime(String nome, int ep, String genero, String tipo, String estudio) {
        this(nome, ep, genero);
        this.tipo = tipo;
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println("Nome do Anime: " + nome);
        System.out.println("Tipo do Anime: " + ep);
        System.out.println("Genero do Anime: " + genero);
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
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
