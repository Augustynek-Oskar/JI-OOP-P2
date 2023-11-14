public class Rectangle extends Square {
    int sideA = 2;
    int sideB = 4;

    @Override
    public float getArea() {
        return sideA * sideB;
    }

    @Override
    public float getPerimeter() {
        return (2 * sideA) + (2 * sideB);
    }
}
