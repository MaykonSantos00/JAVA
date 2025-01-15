package ExerciciosPOO.Exercise4;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(31, 20);
        Circle circle = new Circle(10);
        rectangle.displayType();
        System.out.println("area: " + rectangle.calculateArea());
        System.out.println("--------------------");
        circle.displayType();
        System.out.println("area: " + circle.calculateArea());
    }
}
