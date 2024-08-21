package RevisaoPOO.Aclasseseatributos.exercicio03.teste;

import RevisaoPOO.Aclasseseatributos.exercicio03.dominio.Livro;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "George";
        livro.titulo = "O homem mais rico da babilonia";
        livro.anoPublicacao = 2019;
        livro.descricao = "Conta a historia de Arkad, O home mais rico da babilonia, como ele enriqueceu e multiplicou " +
                "conhecimento";
        livro.editora = "Nova Era";

        System.out.println("### Livro ###");
        System.out.println("Autor: " + livro.autor);
        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Ano: " + livro.anoPublicacao);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Descricao: " + livro.descricao);
    }
}
