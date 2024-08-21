package JavaCore.Arrays;

public class InicializacaoArrayMultidimensional {
    public static void main(String[] args) {
        int[][] calendario = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] calendario2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] calendario3 = new int[3][]; // DEVEMOS DEFINIR A BASE
        calendario3[0] = new int[5];
        calendario3[1] = new int[10];
        calendario3[2] = new int[20];

        for (int[] arrayBase : calendario3) {
            System.out.println("\n-----------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
