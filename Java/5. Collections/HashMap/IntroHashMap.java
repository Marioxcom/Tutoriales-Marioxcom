import java.util.*;

public class IntroHashMap {
    public static void main(String[] args) {
        Map<Integer,String> cuenta = new HashMap<>();

        // .Put(): Añade un información al HashMap.
        cuenta.put(1234, "Mario");
        cuenta.put(1235, "Noa");
        cuenta.put(1236, "Anabel");

        // .ContainsValue(): Verifica si el valor se encuentre en el Map.
        if (cuenta.containsValue("Noa")) {
            System.out.println("Esta presente");
        } else {
            System.out.println("No esta presente");
        }

        // .ContainsKey(): Verifica si la Key se encuentre en el Map.
        if (cuenta.containsValue(1456)) {
            System.out.println("Clave encontrada");
        } else {
            System.out.println("Clave no encontrada");
        }

        // .Values(): Muestra todos los valores.
        System.out.println(cuenta.values());

        // .Remove: Elimina el usuario que indica la clave.
        cuenta.remove(1235);

        // .KeysSet(): Muestra todas las Keys.
        System.out.println(cuenta.keySet());

        // .Get(): Busca el valor de la clave associada.
        String empleado = cuenta.get(1236);
        System.out.println("El empleado buscado es " + empleado);
    }
}