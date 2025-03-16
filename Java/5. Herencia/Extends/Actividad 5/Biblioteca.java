import java.util.ArrayList;

public class Biblioteca {
    protected int dimesion;
    ArrayList<File> biblioteca;

    public Biblioteca(int dimesion) {
        this.dimesion = dimesion;
        this.biblioteca = new ArrayList<>(dimesion);
    }

    public int capacidad() {
        return dimesion;
    }

    public int numeroElementos() {
        return biblioteca.size();
    }

    public boolean añadirFicha(File file) {
        if (!file.getReferencia().isBlank() || !file.getReferencia().isEmpty()) {
            biblioteca.add(file);
            return true;
        } else return false;
    }

    public File buscarReferencia(String referen) {
        for (File f:biblioteca) {
            if (referen.equalsIgnoreCase(f.getReferencia())) {
                return f;
            }
        }
        return null;
    }

    public File buscarPosicion(int posicion) {
        if (posicion < 0 || posicion > biblioteca.size()){
            System.out.println("Posicion fuera de los margenes");
        } else return biblioteca.get(posicion);
        return null;
    }

    public void contenidoBiblioteca() {
        for (File f: this.biblioteca){
            System.out.println(f);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" + biblioteca +
                '}';
    }
}