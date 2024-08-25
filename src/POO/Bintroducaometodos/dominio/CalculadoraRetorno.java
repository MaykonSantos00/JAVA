package POO.Bintroducaometodos.dominio;

public class CalculadoraRetorno {

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar2(double a, double b) {
        return a + b;
    }

    public void imprimeDivisao(double a, double b) {
        if (b == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(a / b);
    }

}
