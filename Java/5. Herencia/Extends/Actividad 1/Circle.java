public class Circle extends GeometricObject{
    protected double radio;

    public Circle(int coord_x, int coord_y, double radio) {
        super(coord_x, coord_y);
        this.radio = radio;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * radio;
    }

    @Override
    double area() {
        return 3.14 * (radio * radio);
    }
}
