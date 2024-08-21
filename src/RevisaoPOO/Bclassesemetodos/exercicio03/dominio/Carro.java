package RevisaoPOO.Bclassesemetodos.exercicio03.dominio;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double comsumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do Carro é: " + capCombustivel * comsumoCombustivel + " Km");
    }

    public double obterAutonomia() {
        System.out.println("O metodo obterAutonomia foi chamado");
        return capCombustivel * comsumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return km / comsumoCombustivel;
    }
}
