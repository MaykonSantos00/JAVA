package POO.Rwrapper.teste;

public class WrapperTeste01 {
    public static void main(String[] args) {
        //Wrapper são objetos que vão encapsular os tipos primitivos ou
        //Classes/Objetos que representão os tipos primitivos

        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 1;
        float floatp = 1;
        double doublep = 1;
        char charp = 'W';
        boolean boolp = true;


        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean boolW = true;

        //autoboxing
        Integer intW2 = 1;

        //boxing
        int intp2 = intW2;

        Integer intW3 = Integer.parseInt("9");
        System.out.println(intW3);
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toLowerCase('b'));


    }
}
