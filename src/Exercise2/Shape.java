package Exercise2;

interface Shape {
    default double getPerimeter() {
        throw new UnsupportedOperationException();
    }

    default double getArea() {
        throw new UnsupportedOperationException();
    }
}