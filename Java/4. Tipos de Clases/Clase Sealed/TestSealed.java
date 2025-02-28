public class TestSealed {
    public static void main(String[] args) {
        Subclase2 subclase2 = new Subclase2("Mario", 22);
        Sealed sealed = new Sealed("Paco", 70);

        System.out.println(subclase2.estoy());
        System.out.println(sealed.estoy());
    }
}
