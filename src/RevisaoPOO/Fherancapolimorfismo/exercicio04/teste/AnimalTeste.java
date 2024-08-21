package RevisaoPOO.Fherancapolimorfismo.exercicio04.teste;

import RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio.Animal;
import RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio.Mamifero;
import RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio.Peixe;

public class AnimalTeste {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Camelo");
        mamifero.setComprimento(150);
        mamifero.setPatas(4);
        mamifero.setCor("Amarelo");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidade(2);

        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setPatas(0);
        peixe.setCor("Cinzento");
        peixe.setAmbiente("Mar");
        peixe.setVelocidade(1.5);
        peixe.setCaracteristicas("Barbatanas e caudas");

        Mamifero mamifero2 = new Mamifero();
        mamifero2.setNome("Urso-do-Canadá");
        mamifero2.setComprimento(180);
        mamifero2.setPatas(4);
        mamifero2.setCor("Vermelho");
        mamifero2.setAmbiente("Terra");
        mamifero2.setVelocidade(0.5);
        mamifero2.setAlimento("Mel");

        Animal[] animais = new Animal[3];
        animais[0] = mamifero;
        animais[1] = mamifero2;
        animais[2] = peixe;

        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
