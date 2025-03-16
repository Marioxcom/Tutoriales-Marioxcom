public class Laboratorios extends Espacios{
    protected int numeroEncendedores;

    public Laboratorios(int id, boolean luzNatural, double superficieM2, double consumoM2, int numeroEncendedores) {
        super(id, luzNatural, superficieM2, consumoM2);
        this.numeroEncendedores = numeroEncendedores;
    }

    @Override
    double consumoPorMetro2() {
        return superficieM2 * consumoM2;
    }

    @Override
    double espacioLibreEstudiasntes() {
        return superficieM2;
    }
}
