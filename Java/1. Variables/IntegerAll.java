import java.lang.*;

public class IntegerAll {
    public static void main(String[] args) {
        // Todos los metodos Integer

        // .sum: Suma los valores de dentro
        int a = 4;
        int b = 5;
        int sum = Integer.sum(a, b);
        System.out.println(sum);

        // .toString: Convierte el int en un String
        String toString = Integer.toString(sum);
        System.out.println(toString.getClass().getName());

        // .expand:
        int expand = Integer.expand(a,b);
        System.out.println(expand);
    }
}
