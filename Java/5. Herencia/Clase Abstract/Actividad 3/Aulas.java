public class Aulas extends Espacios{
    protected int alumnosMax;
    protected boolean sillaPala;
    protected int numeroOrdenadores;
    protected boolean ethernet;

    public Aulas(int id, boolean luzNatural, double superficieM2, double consumoM2, int alumnosMax, boolean sillaPala, int numeroOrdenadores, boolean ethernet) {
        super(id, luzNatural, superficieM2, consumoM2);
        this.alumnosMax = alumnosMax;
        this.sillaPala = sillaPala;
        this.numeroOrdenadores = numeroOrdenadores;
        this.ethernet = ethernet;
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
