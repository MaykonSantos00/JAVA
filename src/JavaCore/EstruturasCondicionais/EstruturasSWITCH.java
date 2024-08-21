package JavaCore.EstruturasCondicionais;

public class EstruturasSWITCH {
    public static void main(String[] args) {
        // char , int , byte , enum , String
        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Caractere Inválido");
        }
    }
}
