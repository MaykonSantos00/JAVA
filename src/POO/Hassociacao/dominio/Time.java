package POO.Hassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogador;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogador) {
        this(nome);
        this.jogador = jogador;
    }

    public void imprime() {
        if (jogador == null) return;
        System.out.println("Time: " + this.nome);
        for (Jogador jogador1 : jogador) {
            System.out.println("Jogador: " + jogador1.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }
}
