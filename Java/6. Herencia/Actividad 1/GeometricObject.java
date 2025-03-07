public abstract class GeometricObject {
    protected int coord_x;
    protected int coord_y;

    public GeometricObject(int coord_x, int coord_y) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    abstract double perimeter();

    abstract double area();

}
