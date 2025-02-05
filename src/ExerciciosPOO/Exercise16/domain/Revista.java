package ExerciciosPOO.Exercise16.domain;

public class Revista extends Item {
    private String datadePublicacao;
    private int edicao;

    public Revista(String autor, String titulo, int quantidade) {
        super(autor, titulo, quantidade);
    }

    public Revista(String autor, String titulo, int quantidade, String datadePublicacao, int edicao) {
        super(autor, titulo, quantidade);
        this.datadePublicacao = datadePublicacao;
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Revista{" +
                super.toString() +
                "datadePublicacao='" + datadePublicacao + '\'' +
                ", edicao=" + edicao +
                '}';
    }

    public void setEdicao(int edicao) {
        if (edicao < 0) {
            throw new IllegalArgumentException("O edicao deve ser maior que 0");
        } else {
            this.edicao = edicao;
        }
    }

    public String getDatadePublicacao() {
        return datadePublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public boolean emprestar() {
        return false;
    }

    @Override
    public void devolver() {

    }
}
