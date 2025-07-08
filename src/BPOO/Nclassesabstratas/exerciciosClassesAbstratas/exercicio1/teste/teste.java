package BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio1.teste;

import BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio1.dominio.Circulo;
import BPOO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio1.dominio.Retangulo;

public class teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        c1.calcaularArea();
        Retangulo r1 = new Retangulo(10, 13);
        r1.calcaularArea();
    }
}
