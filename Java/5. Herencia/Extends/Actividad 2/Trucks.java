public class Trucks extends Vehicles{
    protected double priceTruck = priceDay;
    protected double PMA;

    public Trucks(String tuition, int numPlaces) {
        super(tuition, numPlaces);
    }

    public double totalPrice() {
        return 40 + priceTruck + (20 * PMA);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "priceTruck=" + priceTruck +
                ", PMA=" + PMA +
                ", tuition='" + tuition + '\'' +
                ", priceDay=" + priceDay +
                ", numPlaces=" + numPlaces +
                '}';
    }
}
