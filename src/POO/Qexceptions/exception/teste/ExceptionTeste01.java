package POO.Qexceptions.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\arquivo.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

