package ExerciciosPOO.Exercise16.domain;

public abstract class Item implements Emprestavel {
    private String autor;
    private String titulo;
    private int quantidade;

    public Item(String autor, String titulo, int quantidade) {
        this.autor = autor;
        this.titulo = titulo;
        setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", quantidade=" + quantidade;
    }

    public boolean disponivel() {
        return getQuantidade() > 0;
    }

    public void emprestaItem() {
        System.out.println("Emprestando...");
        this.quantidade--;
    }

    public void devolverItem() {
        System.out.println("Devolvendo...");
        this.quantidade++;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.quantidade = quantidade;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
