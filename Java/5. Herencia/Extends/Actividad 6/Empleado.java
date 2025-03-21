import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    boolean plus(int plusSalarial) {
        if (edad > 40) {
            salario = getSalario() + plusSalarial;
            return true;
        }
        else return false;
    }

    boolean compruebaNombre() {
        if (nombre.isEmpty()) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return edad == empleado.edad && Double.compare(salario, empleado.salario) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido);
    }

}
