package POO.Ileiturateclado;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = leitor.nextInt();
        System.out.println("Digite M ou F para o Sexo do aluno: ");
        char sexo = leitor.next().charAt(0);
        System.out.println("##########################################");
        System.out.println("O aluno " + nome + " tem " + idade + " anos" + " e sexo " + sexo + ".");
    }
}
