package DclassesUtilitarias.Bstring;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Maykon Tavares";
        String nome2 = "Maykon Tavares";
        nome = nome.concat(" Santos");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Maykon Tavares");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        System.out.println("------------------------");

        String nome4 = "  Maykon    ";
        System.out.println(nome4.charAt(0));
        System.out.println(nome4.length());
        System.out.println(nome4.replace("on", "inho"));
        System.out.println(nome4.toLowerCase());
        System.out.println(nome4.toUpperCase());
        String numeros = "012345";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,numeros.length()));
        System.out.println(nome4.trim());//remover os valores em braco do começo e do fim
    }
}
