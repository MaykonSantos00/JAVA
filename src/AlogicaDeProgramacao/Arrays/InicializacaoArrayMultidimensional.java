package AlogicaDeProgramacao.Arrays;

public class InicializacaoArrayMultidimensional {
    public static void main(String[] args) {

        int[][] calendario1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] calendario2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] calendario3 = new int[3][]; // DEVEMOS DEFINIR A BASE
        calendario3[0] = new int[5];
        calendario3[1] = new int[10];
        calendario3[2] = new int[20];

        for (int i = 0; i < calendario1.length; i++) {
            for (int j = 0; j < calendario1[i].length; j++) {
                System.out.print(calendario1[i][j] + " ");
            }
        }

        System.out.println("\n-----------------------------------------");

        for (int[] calend1 : calendario2) {
            for (int calend2 : calend1) {
                System.out.print(calend2 + " ");
            }

        }

        System.out.println("\n-----------------------------------------");

        for (int[] arrayBase : calendario3) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n-----------------");
        }
    }
}
