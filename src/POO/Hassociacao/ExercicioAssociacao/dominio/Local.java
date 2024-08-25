package POO.Hassociacao.ExercicioAssociacao.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
