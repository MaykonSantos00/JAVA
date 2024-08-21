package RevisaoPOO.Ginterfaces.dominio;

public class Cilindro extends Figura3D {
    @Override
    public void calcularArea() {
        System.out.println("A area do cilindro e " + (2 * DimensaoSuperficial.PI * super.getRaio() * super.getAltura())
                + (2 * (super.getRaio() * super.getRaio() * DimensaoSuperficial.PI)));
    }

    @Override
    public void calcularVolume() {
        System.out.println("O volume do cilindro e " + (DimensaoSuperficial.PI * super.getRaio() * super.getRaio()) * super.getAltura());
    }
}
