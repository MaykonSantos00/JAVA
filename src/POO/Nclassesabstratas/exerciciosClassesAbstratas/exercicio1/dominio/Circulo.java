package POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio1.dominio;

public class Circulo extends Forma {
    public final double PI = 3.14;
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcaularArea() {
        System.out.println("A area do circulo é: " + PI * raio * PI);
    }
}
