public class Tipo1 extends Factura{

    public Tipo1(double consum, double saneamiento, double residuales) {
        super(consum, saneamiento, residuales);
    }

    @Override
    void factura() {
        setDescuentoSaneamiento(25);
        setDescuentoResiduales(25);
        double saneamientoTipo1 = getSaneamiento() - (getDescuentoSaneamiento() * getSaneamiento() / 100);
        double residuals = getResiduales() - (getDescuentoResiduales() * getResiduales() / 100);

        System.out.println("DETALL FACTURA\n" +
                "==============\n" +
                "Consum: " + getConsum() + "\n" +
                "Sanejament: " + saneamientoTipo1 + "\n" +
                "Residuals: " + residuals + "\n" +
                "Descompte Aplicat a Sanejament: " + getDescuentoSaneamiento() + "\n" +
                "Descompte Aplicat a Residuals: " + getDescuentoResiduales() + "\n" +
                "TOTAL: " + (residuals + saneamientoTipo1 + getConsum())
        );
    }
}
