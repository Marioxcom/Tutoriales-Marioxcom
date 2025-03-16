public class Metros extends Transport{
    protected double priceTicket;
    Metros(String id, int km_h,double priceTicket) {
        super(id, km_h);
        this.priceTicket = priceTicket;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    @Override
    int tiempoViaje(int distancia) {
        return distancia/km_h;
    }

    @Override
    double precioViaje(int km) {
        int count = 0;
        for (int i = 0; i < km; i++) {
            count++;
            if (count == 5){
                count = 0;
                priceTicket += 1;
            }
        }
        return priceTicket;
    }
}