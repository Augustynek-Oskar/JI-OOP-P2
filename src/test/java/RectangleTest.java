import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
public class RectangleTest extends TestCase {

    public void testGetArea() {
        Rectangle rectangle = new Rectangle();
        float result = rectangle.getArea();
        Assertions.assertEquals(result, 8);
    }

    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle();
        float result = rectangle.getPerimeter();
        Assertions.assertEquals(result,12);
    }
}