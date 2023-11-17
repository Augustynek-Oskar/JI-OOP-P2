public class Rectangle implements AreaAndPerimeter{
    int sideA = 10;
    int sideB = 5;

    @Override
    public int getArea() {
        return sideA * sideB;
    }
  
    @Override
    public int getPerimeter() {
        return (2 * sideA) + (2 * sideB);
    }
  

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
