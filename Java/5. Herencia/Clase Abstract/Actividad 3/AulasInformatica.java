public class AulasInformatica extends Espacios{
    protected int numeroImpresoras;

    public AulasInformatica(int id, boolean luzNatural, double superficieM2, double consumoM2, int numeroImpresoras) {
        super(id, luzNatural, superficieM2, consumoM2);
        this.numeroImpresoras = numeroImpresoras;
    }

    @Override
    double consumoPorMetro2() {
        return superficieM2 * consumoM2;
    }

    @Override
    double espacioLibreEstudiasntes() {
        return superficieM2 - numeroImpresoras;
    }
}
