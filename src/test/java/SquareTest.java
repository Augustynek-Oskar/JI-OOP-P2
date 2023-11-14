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

    public void testGetAreaShouldReturnFour() {
        Square square = new Square();
        float result = square.getArea();
        Assertions.assertEquals(result, 4);
    }

    public void testGetPerimeterShouldReturnEight() {
        Square square = new Square();
        float result = square.getPerimeter();
        Assertions.assertEquals(result, 8);
    }
}