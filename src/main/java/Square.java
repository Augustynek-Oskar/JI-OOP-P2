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
