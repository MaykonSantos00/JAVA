package POO.Lmodificadorfinal.teste;

import POO.Lmodificadorfinal.dominio.Carro;
import POO.Lmodificadorfinal.dominio.Comprador;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("CLA200");

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("kaka");
        System.out.println(carro.COMPRADOR);
    }
}
