package POO.Qexceptions.runtime.teste;

public class RunTimeExceptionsTeste03 {
    public static void main(String[] args) {

        abreConexaoComBancodeDados2();
    }

    public static void abreConexaoComBancodeDados() {
        try {
            System.out.println("Abre conexão com o banco de dados");
            System.out.println("Escrevendo no banco de dados");
            throw new RuntimeException();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Fechando banco de dados");
        }
    }

    public static void abreConexaoComBancodeDados2() {
        try {
            System.out.println("Abre conexão com o banco de dados");
            System.out.println("Escrevendo no banco de dados");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando banco de dados");
        }
    }

}
