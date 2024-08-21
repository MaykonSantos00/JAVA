package JavaCore.Operadores;

public class Operadores {
    public static void main(String[] args) {
        // (+ - * /) - OPERADORES ARITMETICOS
        int a = 1;
        int b = 2;
        System.out.println("Valor " + a + b);
        System.out.println(a + b + " : Valor");

        // (%)
        int resto = 20 % 2;
        System.out.println(resto + " : Valor");

        // (< > <= >=  != ==) - OPERADORES RELACIONAIS
        boolean isDezMAiorQueVinte = (10 > 20);
        System.out.println("Dez Maior que vinte? " + isDezMAiorQueVinte);

        // (&&-(AND)  ||-(OR) !-(NOT)) - OPERADORES LOGICOS

        double valorContaPoupanca = 50;
        double valorContaCorrente = 5000;
        double valorPlaystatin = 3000;
        if (valorContaPoupanca >= valorContaCorrente || valorContaCorrente >= valorPlaystatin) {
            System.out.println("Pode Comprar o PLaystation Filho");
        }

        // (= += -= *= /= %=) OPERADORES DE ATRIBUIÇÃO
        double bonus = 1800;
        bonus -= 1000;
        System.out.println(bonus);

        //  (i++ ++i i-- --i) OPERADORES UNARIOS
        int c = 10;
        c++;
        System.out.println(c);
    }
}
