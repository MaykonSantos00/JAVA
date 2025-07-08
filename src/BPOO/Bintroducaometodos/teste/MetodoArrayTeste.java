package BPOO.Bintroducaometodos.teste;

import BPOO.Bintroducaometodos.dominio.MetodoArray_VarArgs;

public class MetodoArrayTeste {
    public static void main(String[] args) {
        MetodoArray_VarArgs array = new MetodoArray_VarArgs();

        int[] valores = {1, 2, 3, 4, 5};

        array.somaArray(valores);

        array.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

}
