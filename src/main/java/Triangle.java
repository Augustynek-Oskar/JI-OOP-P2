public class Triangle extends Shape {
    int sideA = 10;
    int sideB = 5;
    int sideC = 7;
    int height = 5;

    @Override
    public float getArea() {
        return (float) (7 * 5) / 2;
    }

    @Override
    public float getPerimeter() {
        return sideA + sideB + sideC;
    }
}
