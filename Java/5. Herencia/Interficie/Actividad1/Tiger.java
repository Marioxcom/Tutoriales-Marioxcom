package Actividad1;

public class Tiger extends Feline{
    @Override
    void move() {
        System.out.println("El tigre camina");
    }

    @Override
    void interact() {
        System.out.println("Roaar");
    }
}
