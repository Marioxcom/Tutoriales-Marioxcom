// Esta sí esta permitida
final class Subclase2 extends Sealed {

    public Subclase2(String nombre, int edad) {
        super(nombre, edad);
    }

    // Podemos exportar al estar en la lista
    @Override
    public String estoy() {
        return "Me llamo " + this.nombre + ", tengo " + this.edad + " años estoy en la subclase2";
    }

}
