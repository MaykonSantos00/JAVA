package POO.Ointerfaces.teste;

import POO.Ointerfaces.dominio.DatabaseLoader;
import POO.Ointerfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader dataLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataLoader.loadData();
        fileLoader.loadData();

        dataLoader.remover();
        fileLoader.remover();
    }
}
