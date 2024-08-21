package RevisaoPOO.Ginterfaces.dominio;

public class Triangulo extends Figura2D {

    @Override
    public void calcularArea() {
        System.out.println("A area do triangulo e " + ((super.getBase() * super.getAltura()) / 2));
    }
}
