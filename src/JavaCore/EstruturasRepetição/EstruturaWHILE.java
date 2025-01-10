package JavaCore.EstruturasRepetição;

public class EstruturaWHILE {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.print(count++ + " ");
        }

        System.out.println("\n------------------------------");

        count = 0;
        while (count < 10) {
            System.out.print(++count + " ");
        }
    }
}
