import java.util.Locale;
import java.util.Scanner;

public class TextoSimetrico_Solucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder comprob = new StringBuilder(texto).reverse();

        if (texto.equals(comprob.toString())) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
