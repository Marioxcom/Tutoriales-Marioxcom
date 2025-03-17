public class Pegasus extends Animal implements Horse,Bird{
    public Pegasus(int age, String name) {
        super(age, name);
    }

    public void makeNoise() {
        // Resolviendo el conflicto indicando explícitamente cuál usar
        Bird.super.birdNoise();
        Horse.super.horseNoise();
        System.out.println("¡Sonido único de Pegaso!");
    }

}
