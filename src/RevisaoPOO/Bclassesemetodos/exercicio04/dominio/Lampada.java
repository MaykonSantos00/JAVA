package RevisaoPOO.Bclassesemetodos.exercicio04.dominio;

public class Lampada {
    public String tipoDeLampada;
    public String corLuz;
    public String consumoW;
    public String formato;
    public String marca;
    public String tensaoEletrica;

    public void ligar() {
        System.out.println("Ligando Lâmpada");
    }

    public void desligar() {
        System.out.println("Desligando Lâmpada");
    }
}
