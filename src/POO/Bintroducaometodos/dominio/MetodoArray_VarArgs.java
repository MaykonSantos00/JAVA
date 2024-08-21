package POO.Bintroducaometodos.dominio;

public class MetodoArray_VarArgs {

    public void somaArray(int[] a) {
        int soma = 0;
        for (int i : a) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int b, int... a) {
        int soma = 0;
        for (int i : a) {
            soma += i;
        }
        System.out.println(soma);
    }
}
