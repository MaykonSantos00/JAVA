package RevisaoPOO.Ginterfaces.dominio;

public class Circulo extends Figura2D {
    @Override
    public void calcularArea() {
        System.out.println("Area do circulo é igual a " + (super.getRaio() * (DimensaoSuperficial.PI * 2)));
    }
}
