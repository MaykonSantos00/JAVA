package AlogicaDeProgramacao.Arrays;

public class InicializacaoArray {
    public static void main(String[] args) {

        int[] numero1 = new int[10];
        int[] numero2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numero3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] numero4 = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] numero5 = new String[10];


        for (int i = 0; i < numero1.length; i++) {
            System.out.print(numero1[i] + " ");
        }
        System.out.println("\n----------\n");
        for (int i = 0; i < numero2.length; i++) {
            System.out.print(numero2[i] + " ");
        }

        System.out.println("\n----------\n");

        for (int i = 0; i < numero3.length; i++) {
            System.out.print(numero3[i] + " ");
        }

        System.out.println("\n----------\n");

        for (int i = 0; i < numero4.length; i++) {
            System.out.print(numero4[i] + " ");
        }

        System.out.println("\n----------\n");

        for (int i = 0; i < numero5.length; i++) {
            System.out.print(numero5[i] + " ");
        }
    }
}
