public abstract class Transport {
    protected String id;
    protected int km_h;

    Transport(String id, int km_h) {
        this.id = id;
        this.km_h = km_h;
    }

    abstract int tiempoViaje(int distancia);

    abstract double precioViaje(int distancia);
}
