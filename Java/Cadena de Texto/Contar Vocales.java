import java.util.*;

public class Solution {
    String oracion;
    int contMay;
    int contMin;
    char[] vocalsMin = {'a', 'e', 'i', 'o', 'u'};
    char[]vocalsMay = {'A', 'E', 'I', 'O', 'U'};

    public int identificarVocalsMinusculas() {
        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            for (int j = 0; j < vocalsMin.length; j++) {
                if (caracter == vocalsMin[j]) {
                    contMin++;
                }
            }
        }
        return contMin;
    }
    public int identificarVocalesMayusculas() {
        for (int i = 0; i < oracion.length(); i++) {
            char caracter = oracion.charAt(i);
            for (int j = 0; j < vocalsMay.length; j++) {
                if (caracter == vocalsMay[j]) {
                    contMay++;
                }
            }
        }
        return contMay;
    }
    public int sumarVocals() {
        return identificarVocalesMayusculas() + identificarVocalsMinusculas();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution cadena = new Solution();
        System.out.print("Ingrese su oración: ");
        cadena.oracion = sc.nextLine();

        System.out.println(cadena.sumarVocals());
    }
}