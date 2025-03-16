public class Tipo2 extends Factura{

    public Tipo2(double consum, double saneamiento, double residuales) {
        super(consum, saneamiento, residuales);
    }

    @Override
    void factura() {
        setDescuentoSaneamiento(75);
        setDescuentoResiduales(50);
        double saneamientoTipo2 = getSaneamiento() - (getDescuentoSaneamiento() * getSaneamiento() / 100);
        double residuals = getResiduales() - (getDescuentoResiduales() * getResiduales() / 100);

        System.out.println("DETALL FACTURA\n" +
                "==============\n" +
                "Consum: " + getConsum() + "\n" +
                "Sanejament: " + saneamientoTipo2 + "\n" +
                "Residuals: " + residuals + "\n" +
                "Descompte Aplicat a Sanejament: " + getDescuentoSaneamiento() + "\n" +
                "Descompte Aplicat a Residuals: " + getDescuentoResiduales() + "\n" +
                "TOTAL: " + (residuals + saneamientoTipo2 + getConsum())
        );
    }
}
