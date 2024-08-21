package POO.Ointerfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void loadData() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remover() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void checkPermitions() {
        System.out.println("Checking permitions...");
    }
}
