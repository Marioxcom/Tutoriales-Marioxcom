import java.util.*;

public class notesDam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<Integer>();
        int nota = 0;
        int sumaValors = 0;

        while (nota != -1) {
            nota = sc.nextInt();
            notes.add(nota);
        }

        for (int i = 0; i < notes.size(); i++) {
            sumaValors += notes.get(i);
        }
        System.out.println(sumaValors);
    }
}



