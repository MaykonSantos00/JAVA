package RevisaoPOO.Dvariaveisemetodosestaticos.exercicio02.doiminio;

public class Calculadora {

    public static void somar(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtrair(int a, int b) {
        if (a == 0) {
            System.out.println("Divisão por zero não existe");
            return;
        }
        System.out.println(a - b);
    }

    public static void multiplicar(int a, int b) {
        System.out.println(a * b);
    }

    public static void potencia(int base, int exp) {
        int total = 0;
        if (base == 0) {
            if (exp == 0) {
                System.out.println("Zero sobre zero é inderteminação!");
            } else if (exp > 0) {
                total = 0;
            } else if (exp < 0) {
                total = 0;
            }

        } else if (base > 0) {
            if (exp == 0) {
                total = 1;
            } else if (exp > 0) {
                total = 1;
                for (int i = 0; i < exp; i++) {
                    total *= base;
                }
            } else if (exp < 0) {
//                total = 1;
//                for (int i = 0; i < exp; i++) {
//                    total *= base;
//                }
//                total = 1/total;
            }
        } else if (base < 0) {
            if (exp == 0) {
                total = 1;
            } else if (exp > 0) {
                total = 1;
                for (int i = 0; i < exp; i++) {
                    total *= base;
                }
            } else if (exp < 0) {
//                total = 1;
//                for (int i = 0; i < exp; i++) {
//                    total *= base;
//                }
//                total = 1/total;
            }
        }
        System.out.println(total);
    }

    // Não Recursivo!
    // !5 = 5 * 4 * 3 * 2 * 1 = 120
    // !0 = 1
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }

        int total = 1;
        for (int i = n; i >= 1; i--) {
            total *= i;
        }

        return total;
    }

    // Recursivo
    //fatorial(5) = 5 * fatorial(4)
    //fatorial(4) = 4 * fatorial(3)
    //fatorial(3) = 3 * fatorial(2)
    //fatorial(2) = 2 * fatorial(1)
    //fatorial(1) = 1 * fatorial(0)
    //fatorial(0) = 1;
    public static int fatorialRecursivo(int n) {
        if (n == 0) return 1;

        return n * fatorialRecursivo(n - 1);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somatorio(int n) {
        if (n == 1) {
            return 1;
        }
        return n + somatorio(n - 1);
    }
}
