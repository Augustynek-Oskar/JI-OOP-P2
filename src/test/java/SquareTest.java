import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class SquareTest extends TestCase {

    public void testGetAreaShouldReturnHundred() {
        Square square = new Square();
        int result = square.getArea();
        Assertions.assertEquals(result, 100);
    }

    public void testGetPerimeterShouldReturnForty() {
        Square square = new Square();
        int result = square.getPerimeter();
        Assertions.assertEquals(result, 40);
    }
}