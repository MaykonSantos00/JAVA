package BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio4.dominio;

public abstract class Veiculo {
    protected double distanciaPercorrida;

    public Veiculo(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public abstract void calculaComsumo();
}
