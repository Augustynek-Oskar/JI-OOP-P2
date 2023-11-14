public class Square implements AreaAndPerimeter {

    int sideA = 10;

    @Override
    public int getArea() {
        return sideA * sideA;
    }

    @Override
    public int getPerimeter() {
        return sideA * 4;
    }
}
