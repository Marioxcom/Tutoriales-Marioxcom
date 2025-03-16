public abstract class Organismes {
    protected String nombre;
    protected String familia;
    protected char tipoLuz;
    protected double temperaturaMax;
    protected double temperaturaMin;
    protected int phMax;
    protected int phMin;

    public Organismes(String nombre, String familia, char tipoLuz, double temperaturaMax, double temperaturaMin, int phMax, int phMin) {
        this.nombre = nombre;
        this.familia = familia;
        this.tipoLuz = tipoLuz;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.phMax = phMax;
        this.phMin = phMin;
    }

    abstract String margenPH();

    abstract String margenTemperatura();

    abstract String necesidadesLuz();
}