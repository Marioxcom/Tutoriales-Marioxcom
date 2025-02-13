import java.util.*;

public class IntroHashSet {
    public static void main(String[] args) {
        Set<String> listaDni = new HashSet<>();

        // .Add: Agregar valores al HashSet.
        listaDni.add("08325465J");
        listaDni.add("98235461I");
        listaDni.add("08325465J");
        listaDni.add("91478434K");
        for (String dni : listaDni) { // No repite valores.
            System.out.println("Add: " + dni);
        }

        // .Remove: Elimina un valor.
        listaDni.remove("91478434K");
        for (String dni : listaDni) {
            System.out.println("Remove: " + dni);
        }

        // .Contains: Comprueba se contiene el valor.
        boolean contiene = listaDni.contains("08325465J");
        System.out.println(contiene);

        // .Clear: Elimina todos los valores.
        listaDni.clear();

        // .Size: Devuelve el numero de valores.
        System.out.println(listaDni.size());


    }
}
