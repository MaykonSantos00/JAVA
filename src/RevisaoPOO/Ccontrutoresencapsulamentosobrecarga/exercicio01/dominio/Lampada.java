package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio01.dominio;

public class Lampada {
    private String tipoDeLampada;
    private String corLuz;
    private String consumoW;
    private String formato;
    private String marca;
    private String tensaoEletrica;

    public Lampada(String marca) {
        this.marca = marca;
    }

    public String getTipoDeLampada() {
        return tipoDeLampada;
    }

    public void setTipoDeLampada(String tipoDeLampada) {
        this.tipoDeLampada = tipoDeLampada;
    }

    public String getCorLuz() {
        return corLuz;
    }

    public void setCorLuz(String corLuz) {
        this.corLuz = corLuz;
    }

    public String getConsumoW() {
        return consumoW;
    }

    public void setConsumoW(String consumoW) {
        this.consumoW = consumoW;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTensaoEletrica() {
        return tensaoEletrica;
    }

    public void setTensaoEletrica(String tensaoEletrica) {
        this.tensaoEletrica = tensaoEletrica;
    }

    public void ligar() {
        System.out.println("Ligando Lâmpada");
    }

    public void desligar() {
        System.out.println("Desligando Lâmpada");
    }
}
