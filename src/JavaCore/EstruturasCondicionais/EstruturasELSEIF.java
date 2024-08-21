package JavaCore.EstruturasCondicionais;

public class EstruturasELSEIF {
    public static void main(String[] args) {
        int idade = 15;
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Junior";
        } else {
            categoria = "Senior";
        }
        System.out.println("Categoria: " + categoria);
    }
}
