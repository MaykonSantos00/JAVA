package BPOO.Lmodificadorfinal.teste;

import BPOO.Lmodificadorfinal.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("CLA200");

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);// name = null
        carro.COMPRADOR.setNome("kaka");//set name
        System.out.println(carro.COMPRADOR);//name = kaka




    }
}
