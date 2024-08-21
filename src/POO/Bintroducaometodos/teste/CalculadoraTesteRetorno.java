package POO.Bintroducaometodos.teste;

import POO.Bintroducaometodos.dominio.CalculadoraRetorno;

public class CalculadoraTesteRetorno {
    public static void main(String[] args) {
        CalculadoraRetorno calculadora = new CalculadoraRetorno();
        calculadora.somar(2, 3);
        calculadora.somar2(4, 0);
        calculadora.imprimeDivisao(4, 6);
    }
}
