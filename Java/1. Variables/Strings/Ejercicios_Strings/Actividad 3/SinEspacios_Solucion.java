import java.util.*;

public class SinEspacios_Solucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder oraciones = new StringBuilder(sc.nextLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < oraciones.length(); i++) {
            char c = oraciones.charAt(i);
            if(c != ' ') {
                result.append(c);
            }
        }
        System.out.println(result);
    }
}

