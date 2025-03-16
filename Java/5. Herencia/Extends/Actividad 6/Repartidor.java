public class Repartidor extends Empleado{
    protected String zona;

    public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
        super(nombre, apellido, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
