import java.util.*;

public class IntroHashSet {
    public static void main(String[] args) {
        HashSet<String> listaDni = new HashSet<>();

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

        // .Clone: Crea una copia del HashSet
        Set<String> listaDni2 = (HashSet<String>) listaDni.clone();
        for (String dni : listaDni2) {
            System.out.println("Copy: " + dni);
        }

        // .toArray: Convierte el HashSet en un Array.
        String[] arrayDni = (String[]) listaDni2.toArray();

        // .Contains: Comprueba se contiene el valor.
        boolean contiene = listaDni.contains("08325465J");
        System.out.println(contiene);

        // .Clear: Elimina todos los valores.
        listaDni.clear();

        // .Size: Devuelve el numero de valores.
        System.out.println(listaDni.size());

        // .isEmpty: Comprueba si esta vacio.
        if (listaDni.isEmpty()) {
            System.out.println("No hay registros");
        } else System.out.println("Hay registros");

    }
}
