package POO.Wformatacao.teste;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        String[] countries = Locale.getISOCountries();
        String[] languages = Locale.getISOLanguages();

        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();
        for (String language : languages) {
            System.out.print(language + " ");
        }


    }
}
