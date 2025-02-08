import java.util.*;

public class ContenerTodasLasVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su oración: ");
        String oracion = sc.nextLine();
        int vocal = 0;
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'a' || oracion.charAt(i) == 'A') {
               vocal++;
                break;
            }
        }
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'e' || oracion.charAt(i) == 'E') {
                vocal++;
                break;
            }
        }
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'i' || oracion.charAt(i) == 'I') {
                vocal++;
                break;
            }
        }
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'o' || oracion.charAt(i) == 'O') {
                vocal++;
                break;
            }
        }
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == 'u' || oracion.charAt(i) == 'U') {
                vocal++;
                break;
            }
        }
        if (vocal == 5){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
