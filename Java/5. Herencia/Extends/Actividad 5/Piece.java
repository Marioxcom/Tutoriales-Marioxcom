public class Piece extends File{
    private String author;
    private short nrePags;

    public Piece(String referencia, String titol, String author, short nrePags) {
        super(referencia, titol);
        this.author = author;
        this.nrePags = nrePags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getNrePags() {
        return nrePags;
    }

    public void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "author='" + author + '\'' +
                ", nrePags=" + nrePags +
                '}';
    }
}
