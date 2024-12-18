package POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio4.dominio;

public class Moto extends Veiculo{
    public final double KML = 20;

    public Moto(double distanciaPercorrida) {
        super(distanciaPercorrida);
    }

    @Override
    public void calculaComsumo() {
        System.out.println("Consumo da moto: " + KML*distanciaPercorrida);
    }
}
