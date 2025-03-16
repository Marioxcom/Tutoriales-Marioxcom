public class Test {
    public static void main(String[] args) {
        Factura p1 = new Normal(10,20,30);
        Factura p2 = new Tipo1(10,20,30);
        Factura p3 = new Tipo2(10,20,30);

        p1.factura();
        System.out.println();
        p2.factura();
        System.out.println();
        p3.factura();
    }
}
