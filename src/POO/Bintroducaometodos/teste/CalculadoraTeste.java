package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.CalculadoraVoid;

public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraVoid calculadora = new CalculadoraVoid();
        calculadora.somaDoisNumeros();
        System.out.println("--------------------------");
        calculadora.subtraiDoisNumeros();
    }
}
