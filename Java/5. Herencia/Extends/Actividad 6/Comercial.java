public class Comercial extends Empleado{
    protected double comision;

    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
