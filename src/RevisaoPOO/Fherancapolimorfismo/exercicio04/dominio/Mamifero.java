package RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio;

public class Mamifero extends Animal {
    private String alimento;

    @Override
    public String toString() {
        return "Peixe{" +
                "Nome= " + super.getNome() +
                "; Comprimento= " + super.getComprimento() + "cm" +
                "; Patas= " + super.getPatas() +
                "; Cor= " + super.getCor() +
                ";Ambiente= " + super.getAmbiente() +
                "; Velocidade= " + super.getVelocidade() + "m/s" +
                "; Alimento= " + this.getAlimento() +
                "}";

    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return this.alimento;
    }
}
