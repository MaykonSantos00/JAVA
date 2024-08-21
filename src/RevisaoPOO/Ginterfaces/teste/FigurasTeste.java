package RevisaoPOO.Ginterfaces.teste;

import RevisaoPOO.Ginterfaces.dominio.Cilindro;

public class FigurasTeste {
    public static void main(String[] args) {
        Cilindro c = new Cilindro();
        c.setRaio(2);
        c.setAltura(2);
        c.calcularArea();
    }
}
