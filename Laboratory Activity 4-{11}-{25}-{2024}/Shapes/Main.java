
public class Main {
    public static void main(String[] args) {
        Square square = new Square(32);
        Rectangle rectangle = new Rectangle(12, 90);
        Triangle triangle = new Triangle(30, 40, 50);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}