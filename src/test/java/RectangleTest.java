import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class RectangleTest extends TestCase {

    public void testGetAreaShouldReturnFifty() {
        Rectangle rectangle = new Rectangle();
        int result = rectangle.getArea();
        Assertions.assertEquals(result, 50);
    }

    public void testGetPerimeterShouldReturnThirty() {
        Rectangle rectangle = new Rectangle();
        int result = rectangle.getPerimeter();
        Assertions.assertEquals(result, 30);
    }
}