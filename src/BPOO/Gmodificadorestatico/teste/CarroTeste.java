package BPOO.Gmodificadorestatico.teste;

import BPOO.Gmodificadorestatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(300);
        Carro c1 = new Carro("BMW", 220);
        Carro c2 = new Carro("Ferrari", 240);
        Carro c3 = new Carro("MacLaren", 210);

        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
