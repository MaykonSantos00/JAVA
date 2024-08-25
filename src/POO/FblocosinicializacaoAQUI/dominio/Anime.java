package POO.FblocosinicializacaoAQUI.dominio;

public class Anime {
    private String nome;
    private int[] ep;

    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        ep = new int[100];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
            System.out.print(i + " ");
        }
    }

    public Anime(String nome) {
        setNome(nome);
    }

    public Anime(String nome, int... ep) {
        setNome(nome);
        setEp(ep);
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

    public void setEp(int... ep) {
        this.ep = ep;
    }

    public int[] getEp() {
        return ep;
    }
}
