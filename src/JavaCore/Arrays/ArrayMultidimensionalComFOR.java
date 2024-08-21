package JavaCore.Arrays;

public class ArrayMultidimensionalComFOR {
    public static void main(String[] args) {
        int[][] calendario = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                System.out.print(calendario[i][j] + " ");
            }
            System.out.println("\n");
        }


    }
}
