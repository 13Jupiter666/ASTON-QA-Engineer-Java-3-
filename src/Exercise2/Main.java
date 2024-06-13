package Exercise2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    private static void displayShapeInfo(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Area: " + shape.getArea());
        if (shape instanceof Colorable) {
            Colorable colorableShape = (Colorable) shape;
            System.out.println("Fill Color: " + colorableShape.getFillColor());
            System.out.println("Border Color: " + colorableShape.getBorderColor());
        }
        System.out.println();
    }
}