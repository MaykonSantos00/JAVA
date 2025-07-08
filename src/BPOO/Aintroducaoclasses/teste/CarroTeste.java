package BPOO.Aintroducaoclasses.teste;

import BPOO.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "CLA200";
        carro1.marca = "Mercedes";
        carro1.modelo = "Sport";
        carro1.ano = 2020;

        carro2.nome = "RAM";
        carro2.marca = "Dodge RAM";
        carro2.modelo = "Turbo";
        carro2.ano = 2024;

        System.out.println(carro1.nome);
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("------------------------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
