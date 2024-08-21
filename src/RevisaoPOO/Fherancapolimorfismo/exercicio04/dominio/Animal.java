package RevisaoPOO.Fherancapolimorfismo.exercicio04.dominio;

public abstract class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getAmbiente() {
        return this.ambiente;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return this.velocidade;
    }
}
