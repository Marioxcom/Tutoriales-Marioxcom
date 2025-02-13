import java.util.*;

public class VecesSubcadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase().replace(" ", "");
        String str2 = sc.nextLine().toLowerCase().replace(" ", "");
        int contador = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.substring(i, i + str2.length()).equals(str2)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}

