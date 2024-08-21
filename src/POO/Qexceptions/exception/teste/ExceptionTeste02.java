package POO.Qexceptions.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {

    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\arquivo.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

