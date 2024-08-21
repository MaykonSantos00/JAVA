package POO.Xresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hello"));

        bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hello"));
        // Locale("fr","CA");
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_en_US.properties
        //messages_en.properties
        //messages.properties

    }
}
