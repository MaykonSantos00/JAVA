package AlogicaDeProgramacao.EstruturasCondicionais;

public class Exercicio {
    public static void main(String[] args) {
        double salario = 500000;

        if (salario <= 21453.24) {
            System.out.println("Insento de Taxa!!");
        } else if (salario > 21453.24 && salario <= 32151.48) {
            System.out.println("1-Taxa de: " + salario * 0.07);
        } else if (salario >= 32151.49 && salario <= 42869.16) {
            System.out.println("2-Taxa de: " + salario * 0.15);
        } else if (salario >= 42869.17 && salario <= 53565.72) {
            System.out.println("3-Taxa de: " + salario * 0.225);
        } else {
            System.out.println("4-Taxa de: " + salario * 0.275);
        }
        System.out.println("Fim do Programa");
    }
}
