package POO.Hassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        setNome(nome);
    }

    public void imprime() {
        if (time == null) return;
        System.out.println("Nome: " + this.nome);
        System.out.println("Time: " + this.time.getNome());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
