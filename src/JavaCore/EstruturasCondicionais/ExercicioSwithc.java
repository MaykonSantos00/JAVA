package JavaCore.EstruturasCondicionais;

public class ExercicioSwithc {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo, Final de Semana");
                break;
            case 2:
                System.out.println("Segunda, Dia de Semana");
                break;
            case 3:
                System.out.println("Terça, Dia de Semana");
                break;
            case 4:
                System.out.println("Quarta, Dia de Semana");
                break;
            case 5:
                System.out.println("Quinta, Dia de Semana");
                break;
            case 6:
                System.out.println(", Dia de Semana");
                break;
            case 7:
                System.out.println("Sabado, Final de Semana");
                break;
            default:
                System.out.println("Valor Invalido");
                break;
        }
    }
}
