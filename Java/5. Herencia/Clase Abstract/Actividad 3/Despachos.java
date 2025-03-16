public class Despachos extends Espacios{
    protected int numeroMesas;
    protected boolean maquinaCafe;

    public Despachos(int id, boolean luzNatural, double superficieM2, double consumoM2, int numeroMesa, boolean maquinaCafe) {
        super(id, luzNatural, superficieM2, consumoM2);
        this.numeroMesas = numeroMesas;
        this.maquinaCafe = maquinaCafe;
    }

    @Override
    double consumoPorMetro2() {
        return superficieM2 * consumoM2;
    }

    @Override
    double espacioLibreEstudiasntes() {
        return 0;
    }
}
