public class Minibuses extends Vehicles{
    protected int priceMinibus = 2;
    protected double priceBus = priceDay + 1.5;

    public Minibuses(String tuition, int numPlaces) {
        super(tuition, numPlaces);
    }

    public double totalPrice(int days) {
        return  (priceBus * days) + (numPlaces * priceMinibus) ;
    }

    @Override
    public String toString() {
        return "Minibuses{" +
                "priceMinibus=" + priceMinibus +
                ", priceBus=" + priceBus +
                ", tuition='" + tuition + '\'' +
                ", priceDay=" + priceDay +
                ", numPlaces=" + numPlaces +
                '}';
    }
}
