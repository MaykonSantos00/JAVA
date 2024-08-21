package RevisaoPOO.Ginterfaces.dominio;

public class Quadrado extends Figura2D {
    @Override
    public void calcularArea() {
        System.out.println("A area do Quadrado e " + (super.getLado() * super.getLado()));
    }
}
