public class TrialFile {
    public static void main(String[] args) {
        Piece p1 = new Piece("001","Sirenita","Graham", (short) 45);
        Piece p2 = new Piece("001","Sirenita","Graham", (short) 45);
        Magazine m1 = new Magazine("011","The nights of books",(short) 1998,(short) 78);
        Magazine m2 = new Magazine("033","Interesting facts about Marson",(short) 1998,(short) 78);
        File f = new File("","");

        System.out.println(p1.equals(p2));
        System.out.println(m1.equals(m2));

        f.addMagazine(m1);
        f.addPiece(p2);
    }
}
