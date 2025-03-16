public class Peces extends Organismes{
    private String origen;
    private char dieta;
    private double longitud;

    public Peces(String nombre, String familia, char tipoLuz, double temperaturaMax, double temperaturaMin, int phMax, int phMin, String origen, char dieta, double longitud) {
        super(nombre, familia, tipoLuz, temperaturaMax, temperaturaMin, phMax, phMin);
        this.origen = origen;
        this.dieta = dieta;
        this.longitud = longitud;
    }

    @Override
    String margenPH() {
        return phMax + " - " + phMax;
    }

    @Override
    String margenTemperatura() {
        return temperaturaMin + " - " + temperaturaMax;
    }

    @Override
    String necesidadesLuz() {
        String tipoFinal = "";
        switch (tipoLuz){
            case 'H', 'h':
                tipoFinal = "Necessitats altes de llum";
                break;
            case 'M', 'm':
                tipoFinal = "Necessitats mitjanes de llum";
                break;
            case 'L', 'l':
                tipoFinal = "Necessitats baixes de llum";
                break;
            default:
                tipoFinal = "Error de valor";
                break;
        }
        return tipoFinal;
    }

    String tipoDieta() {
        String dietaFinal = "";
        switch (dieta){
            case 'S', 's':
                dietaFinal = "Tija";
                break;
            case 'B', 'b':
                dietaFinal = "Bulb";
                break;
            case 'R', 'r':
                dietaFinal = "Arrels";
                break;
            default:
                dietaFinal = "Error de valor";
                break;
        }
        return dietaFinal;
    }
}