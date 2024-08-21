package POO.Qexceptions.error.teste;

public class StackOverFlowTeste01 {
    public static void main(String[] args) {

        recursivo();

    }

    public static void recursivo() {
        recursivo();
    }
}
