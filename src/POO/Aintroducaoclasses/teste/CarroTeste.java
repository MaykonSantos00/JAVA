package POO.Aintroducaoclasses.teste;

import POO.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "CLA200";
        carro.marca = "Mercedes";
        carro.modelo = "SPORT";
        carro.ano = 2020;

        carro2.nome = "RAM";
        carro2.marca = "RAM";
        carro2.modelo = "TURBO";
        carro2.ano = 2024;

        System.out.println(carro.nome);
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
        System.out.println("------------------------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
