package POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio1.teste;

import POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio1.dominio.Circulo;
import POO.NclassesabstratasAQUI.exerciciosClassesAbstratas.exercicio1.dominio.Retangulo;

public class teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        c1.calcaularArea();
        Retangulo r1 = new Retangulo(10, 13);
        r1.calcaularArea();
    }
}
