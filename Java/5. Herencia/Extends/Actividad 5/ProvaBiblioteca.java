public class ProvaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        File ficha1 = new File("12", "H1");
        File ficha2 = new Piece("6789", "H2","Marti",(short)12);
        File ficha3 = new Volume("2345", "H3","Marti",(short)12,(short)14);
        File ficha4 = new Magazine("3267","H4",(short)2006,(short)14);

        System.out.println(biblioteca.añadirFicha(ficha1));
        System.out.println(biblioteca.añadirFicha(ficha2));
        System.out.println(biblioteca.añadirFicha(ficha3));
        System.out.println(biblioteca.añadirFicha(ficha4));

        System.out.println(biblioteca.capacidad());
        System.out.println(biblioteca.numeroElementos());
        System.out.println(biblioteca.buscarReferencia("2345"));
        System.out.println(biblioteca.buscarPosicion(2));
        biblioteca.contenidoBiblioteca();
    }
}
