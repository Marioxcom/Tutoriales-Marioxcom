import java.util.Scanner;

public class TextoInvertido_Solucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder texto = new StringBuilder(sc.nextLine());
        StringBuilder nueva = new StringBuilder();

        nueva = texto.reverse();

        System.out.println(nueva);
    }
}
