package Actividad1;

public class Cat extends Feline implements Pet{
    @Override
    void move() {
        System.out.println("El gato camina...");
    }

    @Override
    void interact() {
        System.out.println("¡Miau!");
    }

    @Override
    public void play() {
        System.out.println("El gato da una vuelta sobre si mismo");
    }

    @Override
    public void feed() {
        System.out.println("El gato come");
    }
}
