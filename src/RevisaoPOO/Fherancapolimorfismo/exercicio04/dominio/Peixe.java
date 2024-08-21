package RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio;

public class Peixe extends Animal {
    private String caracteristicas;


    @Override
    public String toString() {
        return "Peixe{" +
                "Nome= " + super.getNome() +
                "; Comprimento= " + super.getComprimento() + "cm" +
                "; Patas= " + super.getPatas() +
                "; Cor= " + super.getCor() +
                ";Ambiente= " + super.getAmbiente() +
                "; Velocidade= " + super.getVelocidade() + "m/s" +
                "; Caracteristica= " + this.getCaracteristicas() +
                "}";

    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }
}
