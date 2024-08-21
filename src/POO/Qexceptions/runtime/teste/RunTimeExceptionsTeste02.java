package POO.Qexceptions.runtime.teste;

public class RunTimeExceptionsTeste02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    /**
     * @param a
     * @param b Não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
