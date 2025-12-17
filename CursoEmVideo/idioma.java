import java.util.Locale;

public class idioma {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sitema é: ");
        System.out.print(idioma.getDisplayLanguage(idioma));
    }
}
