package POO.Hassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        setNome(nome);
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        setJogadores(jogadores);
    }

    public void imprime() {
        if (jogadores == null) return;
        System.out.println("Nome: " + getNome());
        System.out.println("Jogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
