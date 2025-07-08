package BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio4.dominio;

public class Carro extends Veiculo{
    public final double KML = 20;

    public Carro(double distanciaPercorrida) {
        super(distanciaPercorrida);
    }

    @Override
    public void calculaComsumo() {
        System.out.println("Comsumo do carro: " + KML*distanciaPercorrida);
    }
}
