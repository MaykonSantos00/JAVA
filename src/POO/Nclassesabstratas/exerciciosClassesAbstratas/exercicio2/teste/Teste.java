package POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio2.teste;

import POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio2.dominio.Cachorro;
import POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio2.dominio.Gato;
import POO.Nclassesabstratas.exerciciosClassesAbstratas.exercicio2.dominio.Vaca;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        Gato gato = new Gato();
        gato.emitirSom();
        Vaca vaca = new Vaca();
        vaca.emitirSom();
    }
}
