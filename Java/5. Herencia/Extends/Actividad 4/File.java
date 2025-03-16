import java.util.ArrayList;
import java.util.Objects;

public class File {
    private String referencia;
    private String titol;
    protected ArrayList<Magazine> magazine = new ArrayList<>();
    protected ArrayList<Piece> piece = new ArrayList<>();
    protected ArrayList<Volume> volume = new ArrayList<>();

    public File(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        Object o;
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void addMagazine(Magazine m) {
        magazine.add(m);
    }

    public void addPiece(Piece p) {
        piece.add(p);
    }

    public void addVolume(Volume v) {
        volume.add(v);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(referencia, file.referencia);
    }
}
