package AlogicaDeProgramacao.EstruturasRepetição;

public class ExercicioBREAK {
    public static void main(String[] args) {

        int dias = 0;
        int valorDoCarro = 60000;
        for (int i = 1; i >= valorDoCarro; i++) {
            dias++;
            if (i >= valorDoCarro) {
                System.out.println("Parabéns Você Pode Comprar o Carro");
                break;
            }
            System.out.println("Desculpe, voce ainda não pode ter um carro ;( .Mas Você já tem guardado: " + i + " em "
                    + dias + " Dias");

        }
    }
}
