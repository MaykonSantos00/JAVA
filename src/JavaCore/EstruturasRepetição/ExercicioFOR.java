package JavaCore.EstruturasRepetição;

public class ExercicioFOR {
    public static void main(String[] args) {
        for (int x = 0; x <= 1000000; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        int count = 0;
        while (count <= 1000000) {
            if (count % 2 == 0) {
                System.out.print(count + " ");
                count++;
            }
        }
        count = 0;
        do {
            if (count % 2 == 0) {
                System.out.print(count + " ");
                count++;
            }
        } while (count <= 1000000);
        {
            if (count % 2 == 0) {
                System.out.print(count + " ");
                count++;
            }
        }
    }
}
