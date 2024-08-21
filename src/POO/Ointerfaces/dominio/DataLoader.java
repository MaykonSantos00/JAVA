package POO.Ointerfaces.dominio;

public interface DataLoader {
    public static final int MAX = 10;

    public abstract void loadData();

    default void checkPermitions() {
        System.out.println("Removendo");
    }

    ;

    public static void retriveMaxDataSize() {
        System.out.println("Retriveendo");
    }

    ;
}
