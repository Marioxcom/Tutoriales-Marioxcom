public class TestGeometric {
    public static void main(String[] args) {
        Square square = new Square(6,8,2.2);
        Circle circle = new Circle(2,5,5.5);

        System.out.println("Perimeter Square: " + square.perimeter());
        System.out.println("Area Square: " + square.area());
        System.out.println("Perimeter Circle: " + circle.perimeter());
        System.out.println("Area Circle: " + circle.area());
    }
}
