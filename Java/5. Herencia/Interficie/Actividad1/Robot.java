package Actividad1;
import java.util.ArrayList;

public abstract class Robot {
    private String nombreRobot;
    ArrayList<Robot> nombresRobots;

    abstract void move();

    abstract void interact();
}
