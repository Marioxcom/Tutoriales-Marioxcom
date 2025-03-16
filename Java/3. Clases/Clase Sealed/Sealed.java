// Solo permitimos la herencia a Subclase2
sealed class Sealed permits Subclase2 {
    protected String nombre;
    protected int edad;

    public Sealed(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String estoy() {
        return "Me llamo " + this.nombre + ", tengo " + this.edad + " años estoy en la clase Sealed";
    }
}
