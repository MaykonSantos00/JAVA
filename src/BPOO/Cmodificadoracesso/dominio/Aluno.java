package BPOO.Cmodificadoracesso.dominio;

public class Aluno {
    private String nome;
    private int idade;

    public void impressao() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) return;
        this.idade = idade;
    }
}
