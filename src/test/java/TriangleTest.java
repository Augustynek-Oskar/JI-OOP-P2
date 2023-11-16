import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;


public class TriangleTest extends TestCase {

    public void testTestToString() {
        Triangle triangle = new Triangle();
        int height = 12;
        int width = 10;

        String result = triangle.toString();

        Assertions.assertEquals("Triangle {width= 10, height= 12}", result);

import java.util.concurrent.TransferQueue;
      
public class TriangleTest extends TestCase {

    public void testGetAreaShouldReturnSeventeenPointFive() {
        Triangle triangle = new Triangle();
        float result = triangle.getArea();
        Assertions.assertEquals(result, 17.5f);
    }

    public void testGetPerimeterShouldReturnTwentyTwo() {
        Triangle triangle = new Triangle();
        float result = triangle.getPerimeter();
        Assertions.assertEquals(result, 22);
    }
}