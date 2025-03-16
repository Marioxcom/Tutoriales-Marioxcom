public class Cars extends Transport{
    protected String fuelType;
    protected double fuelPrice;
    protected double litersSpent;

    Cars(String id, int km_h, double fuelPrice, double litersSpent) {
        super(id, km_h);
        this.fuelPrice = fuelPrice;
        this.litersSpent = litersSpent;
    }

    @Override
    int tiempoViaje(int distancia) {
        return distancia/km_h;
    }

    @Override
    double precioViaje(int distancia) {
        return (distancia / litersSpent) * fuelPrice;
    }


}
