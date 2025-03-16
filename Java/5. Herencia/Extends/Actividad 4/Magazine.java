import java.util.Objects;

public class Magazine extends File{
    private short any;
    private short nro;

    public Magazine(String referencia, String titol, short any, short nro) {
        super(referencia, titol);
        this.any = any;
        this.nro = nro;
    }

    public short getAny() {
        return any;
    }

    public void setAny(short any) {
        this.any = any;
    }

    public short getNro() {
        return nro;
    }

    public void setNro(short nro) {
        this.nro = nro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return any == magazine.any && nro == magazine.nro;
    }
}
