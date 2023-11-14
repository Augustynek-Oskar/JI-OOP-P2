import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

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