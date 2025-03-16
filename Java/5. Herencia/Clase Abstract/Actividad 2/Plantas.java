public class Plantas extends Organismes{
    private char tipoPlanta;

    public Plantas(String nombre, String familia, char tipoLuz, double temperaturaMax, double temperaturaMin, int phMax, int phMin, char tipoPlanta) {
        super(nombre, familia, tipoLuz, temperaturaMax, temperaturaMin, phMax, phMin);
        this.tipoPlanta = tipoPlanta;
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
}