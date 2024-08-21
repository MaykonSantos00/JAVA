package RevisaoPOO.Ginterfaces.dominio;

public class Piramide extends Figura3D {
    @Override
    public void calcularArea() {
        System.out.println("A area da piramide e " + (super.getAreaBase() * super.getAreaBase()) + ((super.getBase() * super.getAltura()) / 2));
    }

    @Override
    public void calcularVolume() {
        System.out.println("O volume da piramide e " + ((2 * super.getLado() * super.getAltura()) / 3));
    }
}
