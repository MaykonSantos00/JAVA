package RevisaoPOO.Ccontrutoresencapsulamentosobrecarga.exercicio03.dominio;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double[][] notaDisciplinas;
    private String[] nomeDisciplina;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nomeDisciplina = new String[3];
        this.notaDisciplinas = new double[3][4];
    }

    public void imprimirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);

        System.out.println("Curso: " + curso);
        for (int i = 0; i < this.nomeDisciplina.length; i++) {
            System.out.println("Disciplina: " + this.nomeDisciplina[i]);
            for (int j = 0; j < this.notaDisciplinas.length; j++) {
                System.out.print("Nota " + (j + 1) + ": " + this.notaDisciplinas[i][j] + " ");
            }
        }
    }

    public String verificaAprovado() {
        double[] nota = new double[nomeDisciplina.length];
        for (int i = 0; i < this.nomeDisciplina.length; i++) {
            for (int j = 0; j < this.notaDisciplinas.length; j++) {
                nota[i] += notaDisciplinas[i][j];
            }
        }
        for (int i = 0; i < this.nomeDisciplina.length; i++) {
            System.out.println(nomeDisciplina[i]);
            if (nota[i] > 7) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
        return " ";
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[][] getNotaDisciplinas() {
        return notaDisciplinas;
    }

    public void setNotaDisciplinas(double[][] notaDisciplinas) {
        this.notaDisciplinas = notaDisciplinas;
    }

    public String[] getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String[] nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setNomeDisciplinaPos(int posicao, String nomeDisciplina) {
        this.nomeDisciplina[posicao] = nomeDisciplina;
    }

    public void setNotaDisciplinaPos(int posI, int posJ, double nota) {
        notaDisciplinas[posI][posJ] = nota;
    }
}
