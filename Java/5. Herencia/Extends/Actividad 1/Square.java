public class Square extends GeometricObject{
    protected double costat;

    public Square(int coord_x, int coord_y, double costat) {
        super(coord_x, coord_y);
        this.costat = costat;
    }

    @Override
    double perimeter() {
        return 4 * costat;
    }

    @Override
    double area() {
        return costat * costat;
    }
}
