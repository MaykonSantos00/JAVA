package POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio1.dominio;

public class Retangulo extends Forma{
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcaularArea() {
        System.out.println("A area do retangulo é : " + base*altura);
    }
}
