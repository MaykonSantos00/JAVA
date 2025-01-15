package ExerciciosPOO.Exercise4;

public class Circle extends GeometricShape{
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void displayType() {
        System.out.println("GeometricShape: Circle");
    }

    public double getRaio() {
        return raio;
    }
}
