import java.util.ArrayList;

public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList<ClassArrayList> clase = new ArrayList<>();

        // .Add: Añade al ArrayList.
        clase.add(new ClassArrayList("Maria",19,false));
        clase.add(new ClassArrayList("Laura",43,false));
        clase.add(new ClassArrayList("Gines",50,false));
        clase.add(new ClassArrayList("Antonio",29,true));

        // .Size: Cuenta el número de valores.
        System.out.println(clase.size());

        // .Get: Muestra los valores de la posición marcada
        System.out.println(clase.get(2));
        
    }
}
