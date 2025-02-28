// Esta clase intenta heredar de Sealed, pero no está en la lista de "permits",
// por lo que dará error si descomentamos el código de abajo.
public class Subclase1 {  /* extends Sealed{ // ❌ Error: Sealed no permite heredar a Subclase1

    public Subclase1(String nombre, int edad) {
        super(nombre, edad);} */
}
