import java.util.ArrayList;

public class Vehicles {
    ArrayList<Vehicles> lista = new ArrayList<>();
    protected String tuition;
    protected double priceDay = 10;
    protected int numPlaces;


    public Vehicles(String tuition, int numPlaces) {
        this.tuition = tuition;
        this.numPlaces = numPlaces;
    }

    public void Add(Vehicles p) {
        lista.add(p);
    }


}
