package Actividad1;

public class RoboDog extends Robot implements Pet{
    @Override
    void move() {
        System.out.println("El perro robot rueda");
    }

    @Override
    void interact() {
        System.out.println("¡Woof-bzzt!");
    }

    @Override
    public void play() {
        System.out.println("El perro robot levanta las patas delanteras");
    }

    @Override
    public void feed() {
        System.out.println("El perro robot no puede comer");
    }
}
