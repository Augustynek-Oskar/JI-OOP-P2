import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;


public class TriangleTest extends TestCase {

    public void testTestToString() {
        Triangle triangle = new Triangle(10, 12);


        String result = triangle.toString();

        Assertions.assertEquals("Triangle {width= 10, height= 12}", result);
    }
}