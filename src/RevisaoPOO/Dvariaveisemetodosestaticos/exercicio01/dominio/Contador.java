package RevisaoPOO.Dvariaveisemetodosestaticos.exercicio01.dominio;

public class Contador {
    private static int contador;

    public static void incrementar() {
        contador++;
    }

    public static void zerar() {
        contador = 0;
    }

    public static int getContador() {
        return contador;
    }
}
