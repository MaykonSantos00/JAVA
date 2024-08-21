package JavaCore.Arrays;

import javax.swing.event.MenuDragMouseListener;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class InicializacaoArray {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] numero2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numero3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        System.out.println("\n----------\n");
        for (int i = 0; i < numero2.length; i++) {
            System.out.print(numero2[i] + " ");
        }
        System.out.println("\n----------\n");

        for (int i = 0; i < numero3.length; i++) {
            System.out.print(numero3[i] + " ");
        }
    }
}
