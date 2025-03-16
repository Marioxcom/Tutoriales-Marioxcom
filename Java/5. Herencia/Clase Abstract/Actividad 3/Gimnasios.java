public class Gimnasios extends Espacios{
    protected boolean duchas;
    protected int numeroGradas;

    public Gimnasios(int id, boolean luzNatural, double superficieM2, double consumoM2) {
        super(id, luzNatural, superficieM2, consumoM2);
    }

    @Override
    double consumoPorMetro2() {
        return superficieM2 * consumoM2;
    }

    @Override
    double espacioLibreEstudiasntes() {
        return superficieM2 - numeroGradas;
    }
}
