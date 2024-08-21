package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.MetodoArray_VarArgs;

public class MetodoArrayTeste {
    public static void main(String[] args) {
        MetodoArray_VarArgs m = new MetodoArray_VarArgs();

        int[] valores = {1, 2, 3, 4, 5};

        m.somaArray(valores);

        m.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}
