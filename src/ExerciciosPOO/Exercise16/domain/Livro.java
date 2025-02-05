package ExerciciosPOO.Exercise16.domain;

public class Livro extends Item {
    private Genero genero;

    public Livro(String autor, String titulo, int quantidade) {
        super(autor, titulo, quantidade);
    }

    public Livro(String autor, String titulo, int quantidade, Genero genero) {
        super(autor, titulo, quantidade);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                super.toString() +
                ", genero=" + genero +
                '}';
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public boolean emprestar() {
        if (super.disponivel()) {
            super.emprestaItem();
            return true;
        }
        System.out.println("Quantidade indiponivel para emprestar");
        return false;

    }

    @Override
    public void devolver() {
        super.devolverItem();
    }
}
