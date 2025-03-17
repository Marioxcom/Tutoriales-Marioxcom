package Actividad1;

public class Lion extends Feline{
    @Override
    void move() {
        System.out.println("El leon camina");
    }

    @Override
    void interact() {
        System.out.println("Grrrr");
    }
}
