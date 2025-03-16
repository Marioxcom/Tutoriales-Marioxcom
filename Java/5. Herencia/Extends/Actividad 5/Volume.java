import java.util.Objects;

public class Volume extends Piece{
    private short nro;

    public Volume(String referencia, String titol, String author, short nrePags, short nro) {
        super(referencia, titol, author, nrePags);
        this.nro = nro;
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
        Volume volume = (Volume) o;
        return nro == volume.nro;
    }

    @Override
    public String toString() {
        return "Volume{" +
                "nro=" + nro +
                '}';
    }
}
