public class Circle extends Shape{
    float radius = 4;

    @Override
    public float getArea() {
        return (float) (3.14 * (radius * radius));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * 3.14 * radius);
    }
}
