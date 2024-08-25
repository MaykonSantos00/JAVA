package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.CalculadoraRetorno;

public class CalculadoraTesteRetorno {
    public static void main(String[] args) {

        CalculadoraRetorno calculadora = new CalculadoraRetorno();

        double soma1 = calculadora.somar(2, 3);
        System.out.println(soma1);

        double soma2 = calculadora.somar2(4, 0);
        System.out.println(soma2);

        calculadora.imprimeDivisao(4, 6);
    }
}
