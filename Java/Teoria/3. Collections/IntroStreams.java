package ui;

import java.util.ArrayList;

public class IntroStreams {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("A");
        paises.add("B");
        paises.add("B");
        paises.add("D");

        long paisesList = paises.stream()
                .count(); // Cuenta el número de valores de dentro
        System.out.println(paisesList);

        // .Distinct: No devuelve valores repetidos.
        System.out.println(paises.stream().distinct().toList());

        // .ForEach: Devuelve todos los valores dentro del un bucle.
        paises.stream().forEach(System.out::println);

        // .Filter: Filtra dependiedo de los parametros puestos.
        paises.stream()
                .filter((pais) -> pais.toLowerCase().contains("a"))
                .forEach(s -> System.out.println("Filter: " + s));

        // .Map:
        paises.stream()
                .map( p -> p.length())
                .forEach(System.out::println);
    }
}
