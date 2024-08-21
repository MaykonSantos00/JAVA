package POO.Ointerfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void loadData() {
        System.out.println("Loading data from file...");
    }

    @Override
    public void remover() {
        System.out.println("Removing data from file...");
    }

    @Override
    public void checkPermitions() {
        System.out.println("Checking permissions...");
    }
}
