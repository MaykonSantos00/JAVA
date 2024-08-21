package JavaCore.EstruturasCondicionais;

public class EstruturasIF {
    public static void main(String[] args) {
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida Alcólica");
        }

        if (!(idade >= 18)) {
            System.out.println("Autorizado a comprar bebida Alcólica");
        }
    }
}
