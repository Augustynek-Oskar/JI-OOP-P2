public class Square extends Shape {
    int sideA = 2;

    @Override
    public float getArea() {
        return sideA * sideA;
    }

    @Override
    public float getPerimeter() {
        return sideA * 4;
    }
}
