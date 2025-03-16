public class BIkes extends Transport{
    protected int numberGears;

    BIkes(String id, int km_h) {
        super(id, km_h);
    }


    @Override
    int tiempoViaje(int distancia) {
        return distancia/km_h;
    }

    @Override
    double precioViaje(int distancia) {
        return tiempoViaje(distancia) * 1.70;
    }
}
