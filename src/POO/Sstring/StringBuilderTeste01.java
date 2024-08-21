package POO.Sstring;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Maykon Tavares";
        nome.concat(" Lindo");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Maykon Tavares");
        sb.append(" Lindo").append(" Santos");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
