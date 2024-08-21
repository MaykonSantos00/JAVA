package RevisaoPOO.Ginterfaces.dominio;

public class Cubo extends Figura3D {
    @Override
    public void calcularArea() {
        System.out.println("Area do cubo " + (6 * super.getLado()));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume do cubo e " + (3 * super.getLado()));
    }
}
