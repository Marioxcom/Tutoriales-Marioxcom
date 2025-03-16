public abstract class Factura {
    protected double consumFactura;
    protected double saneamientoFactura;
    protected double residualesFactura;
    protected double descuentoSaneamiento;
    protected double descuentoResiduales;

    public Factura(double consum, double saneamiento, double residuales) {
        this.consumFactura = consum;
        this.saneamientoFactura = saneamiento;
        this.residualesFactura = residuales;
        this.descuentoSaneamiento = descuentoSaneamiento;
        this.descuentoResiduales = descuentoResiduales;
    }

    public double getConsum() {
        return consumFactura;
    }

    public double getSaneamiento() {
        return saneamientoFactura;
    }

    public double getResiduales() {
        return residualesFactura;
    }

    public double getDescuentoSaneamiento() {
        return descuentoSaneamiento;
    }

    public double getDescuentoResiduales() {
        return descuentoResiduales;
    }

    public void setDescuentoSaneamiento(double descuentoSaneamiento) {
        this.descuentoSaneamiento = descuentoSaneamiento;
    }

    public void setDescuentoResiduales(double descuentoResiduales) {
        this.descuentoResiduales = descuentoResiduales;
    }

    abstract void factura();


}
