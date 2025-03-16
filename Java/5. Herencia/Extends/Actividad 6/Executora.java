public class Executora {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Guillermo","Lama", 44,1300.00);
        Empleado empleado2 = new Empleado("Guillermo","Lama", 44,1300.00);
        Empleado empleado1 = new Repartidor("Santi", "Pérez", 34,1500.00,"Tarragona");
        Repartidor repartidor = new Repartidor("Gabriel", "Pérez", 55,1500.00,"Madrid");
        Comercial comercial = new Comercial("Pablo","Matamoros",25,2100.99,10);
        System.out.println(empleado instanceof Empleado);
        System.out.println(empleado1.getClass());
        System.out.println(comercial.getClass());
        System.out.println(empleado.equals(empleado2));
    }
}
