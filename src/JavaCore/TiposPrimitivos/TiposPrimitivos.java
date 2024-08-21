package JavaCore.TiposPrimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //long, int, short, double, float, char, byte, boolean

        // Por padrão, Os dados numericos são do tipo int, caso seja inteiro, e double caso seja, decimal.

        long bigNumber = 30000000000L; // L no final, é para representar que é um dado do tipo Long
        int number = 30000;
        short numberShort = 3400;
        byte numberByte = 34;

        double numberDouble = 3400.0;
        float numberFloat = 3400.0F; // F no final é para indentificar que o dado é do tipo Float.

        char numberChar = 34;
        char numberChar2 = 'b';
        // caso seja posto aspas simples('') e um caractere dentro dele, será impresso o própio
        // caráctere. Caso seja posto um valor numerico, ele fará referencia à uma tabela(ascii), onde o valor
        // representa um caractere

        boolean numberBoolean = true; // é um dado lógico, que representa verdadeiro ou falso;
        boolean numberBoolean2 = false;
    }
}
