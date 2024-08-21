package POO.Gmodificadorestatico.teste;

import POO.Gmodificadorestatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(250);
        Carro c1 = new Carro("BMW", 220);
        Carro c2 = new Carro("Ferrari", 240);
        Carro c3 = new Carro("MacLaren", 210);

        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
