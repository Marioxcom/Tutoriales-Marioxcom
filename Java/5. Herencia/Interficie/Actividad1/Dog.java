package Actividad1;

public class Dog extends Canine implements Pet{
    @Override
    public void move() {
        System.out.println("El perro camina");
    }

    @Override
    public void interact() {
        System.out.println("'Guau!");
    }

    @Override
    public void play() {
        System.out.println("El perro da una vuelta sobre si mismo");
    }

    @Override
    public void feed() {
        System.out.println("El perro come");
    }
}
