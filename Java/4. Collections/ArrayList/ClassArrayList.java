public class ClassArrayList {
    private String nombre;
    private int edad;
    private boolean baja;

    public ClassArrayList(String nombre, int edad, boolean baja) {
        this.nombre = nombre;
        this.edad = edad;
        this.baja = baja;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isBaja() {
        return baja;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre +
                ", edad: " + edad +
                ", baja: " + baja;
    }
}
