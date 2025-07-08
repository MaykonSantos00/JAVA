package AlogicaDeProgramacao.Arrays;

public class ArrayComFor {
    public static void main(String[] args) {
        String[] nome = new String[10];
        nome = new String[5];
        //TOMAR CUIDADO PARA NÃO SOBREPOR O ARRAY, COMO O EXEMPLO ACIMA, AULA 34 DEV DOJO

        for (int i = 0; i < nome.length; i++) {
            nome[i] = "Nome " + i;
            System.out.println(nome[i]);

        }
    }
}
