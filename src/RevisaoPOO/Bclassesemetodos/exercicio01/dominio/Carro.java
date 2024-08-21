package RevisaoPOO.Bclassesemetodos.exercicio01.dominio;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double comsumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do Carro é: " + capCombustivel * comsumoCombustivel + " Km");
    }

}
