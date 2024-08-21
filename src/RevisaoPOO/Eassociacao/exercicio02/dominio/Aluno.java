package RevisaoPOO.Eassociacao.exercicio02.dominio;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    {
        notas = new double[4];
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setNotasPos(int pos, double nota) {
        if (nota < 0 || nota > 10) {
            this.notas[pos] = 0;
        } else {
            this.notas[pos] = nota;
        }
    }
}
