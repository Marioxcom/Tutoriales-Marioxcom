package Actividad1;

public class Wolf extends Canine{

    @Override
    void move() {
        System.out.println("El lobo camina");
    }

    @Override
    void interact() {
        System.out.println("Auuuu");
    }
}
