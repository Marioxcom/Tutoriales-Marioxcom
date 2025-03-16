public class Cars extends Vehicles{
    protected double priceCar = priceDay + 1.5;

    public Cars(String tuition, int numPlaces) {
        super(tuition, numPlaces);
    }

    public double totalPrice(int days) {
        return priceCar * numPlaces * days;
    }

    @Override
    public String toString() {
        return "Cars {" +
                "priceCar: " + priceCar +
                ", tuition: '" + tuition + '\'' +
                ", numPlaces: " + numPlaces +
                '}';
    }
}
