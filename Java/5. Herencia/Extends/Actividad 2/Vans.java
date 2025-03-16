public class Vans extends Vehicles{
    protected double priceVan = priceDay;
    protected double PMA;

    public Vans(String tuition, int numPlaces, double PMA) {
        super(tuition, numPlaces);
        this.PMA = PMA;
    }

    public double totalPrice() {
        return  priceVan + (20*PMA);
    }

    @Override
    public String toString() {
        return "Vans{" +
                "priceVan=" + priceVan +
                ", PMA=" + PMA +
                ", tuition='" + tuition + '\'' +
                ", priceDay=" + priceDay +
                ", numPlaces=" + numPlaces +
                '}';
    }
}
