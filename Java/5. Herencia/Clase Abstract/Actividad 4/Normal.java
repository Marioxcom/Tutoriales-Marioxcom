public class Normal extends Factura{

    public Normal(double consum, double saneamiento, double residuales) {
        super(consum, saneamiento, residuales);
    }

    @Override
    void factura() {
        setDescuentoSaneamiento(0);
        setDescuentoResiduales(0);

        System.out.println("DETALL FACTURA\n" +
                "==============\n" +
                "Consum: " + getConsum() + "\n" +
                "Sanejament: " + getSaneamiento() + "\n" +
                "Residuals: " + getResiduales() + "\n" +
                "Descompte Aplicat a Sanejament: " + getDescuentoSaneamiento() + "\n" +
                "Descompte Aplicat a Residuals: " + getDescuentoResiduales() + "\n" +
                "TOTAL: " + (getResiduales() + getSaneamiento() + getConsum()));
    }
}
