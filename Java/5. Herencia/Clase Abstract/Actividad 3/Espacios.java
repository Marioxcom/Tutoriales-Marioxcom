public abstract class Espacios {
    protected int id;
    protected boolean luzNatural;
    protected double superficieM2;
    protected double consumoM2;

    public Espacios(int id, boolean luzNatural, double superficieM2, double consumoM2) {
        this.id = id;
        this.luzNatural = luzNatural;
        this.superficieM2 = superficieM2;
        this.consumoM2 = consumoM2;
    }

    abstract double consumoPorMetro2();

    abstract double espacioLibreEstudiasntes();
}
