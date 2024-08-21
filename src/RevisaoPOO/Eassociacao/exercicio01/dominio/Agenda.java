package RevisaoPOO.Eassociacao.exercicio01.dominio;

public class Agenda {

    private String nome;
    private Contato[] contados;

    public Agenda(String nome, int numeroDeContados) {
        this.setNome(nome);
        Contato[] contatos = new Contato[numeroDeContados];
    }

    public void imprimeContatos() {
        if (contados == null) return;
        System.out.println("Nome da Agenda: " + getNome());
        for (Contato contatus : contados) {
            System.out.println("Nome:" + contatus.getNome() + " - " +
                    "Telefone: " + contatus.getTelefone() + " - " +
                    "Email: " + contatus.getEmail());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContados() {
        return contados;
    }

    public void setContados(Contato[] contados) {
        this.contados = contados;
    }
}
