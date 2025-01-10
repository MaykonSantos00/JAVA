package POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio4.teste;

import POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio4.dominio.Carro;
import POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio4.dominio.Moto;

public class teste {
    public static void main(String[] args) {
        Carro carro = new Carro(30);
        carro.calculaComsumo();
        Moto moto = new Moto(10);
        moto.calculaComsumo();
    }
}
