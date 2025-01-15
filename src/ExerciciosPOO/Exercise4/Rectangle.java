package ExerciciosPOO.Exercise4;

public class Rectangle extends GeometricShape{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height;
    }

    @Override
    public void displayType() {
        System.out.println("GeometricShape: Rectangle");
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
